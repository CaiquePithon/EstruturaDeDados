package ListaPilhaQuestao04;

import java.util.Scanner;

public class TestaPilha {
	public static void main(String[] args) {
		TestaPilha testaLista = new TestaPilha();
		ListaPilha pilha = new ListaPilha();
		boolean verifVazia = true;


		/*4. Projete uma estrutura do tipo pilha para guardar informações de páginas da
		web visitadas.
		a) Escreva a função inicializarPilha
		b) Escreva a função push para adicionar um elemento à pilha.
		c) Escreva a função pop para remover
		*/
		
		testaLista.push(pilha, "Google visitado");
		testaLista.push(pilha, "Youtube visitado");
		
		
		testaLista.print(pilha);
		
		testaLista.pop(pilha);
		
		testaLista.print(pilha);
		
		testaLista.pop(pilha);
		testaLista.print(pilha);
	}
	
	

	public void push(ListaPilha listaEncadeada, String l) {
		System.out.println("Adicionando...");
		
		Site site = new Site();
		site.nome = l;
		listaEncadeada.adicionar(site); 
	}

	public void pop(ListaPilha listaEncadeada) {
		listaEncadeada.remover();

	}
	
	public void verifVazia(ListaPilha listaEncadeada) {
		listaEncadeada.verifVazia();

	}

	public void print(ListaPilha lista) {
		if(lista.verifVazia()) {
			System.out.println("\nPilha esta vazia");
		}else {
			System.out.println("\nVamos ver a pilha de Livros:\n");
			while (lista.temProximo()) {							
				System.out.println(lista.getAtual().getDado().getNome());
			}
			
			/*while (lista.temAnterior()) {							
				System.out.println(lista.getAtual().getDado().getNome());
			}*/
		}
	}
}