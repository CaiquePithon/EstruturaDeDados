package ListaPilhaQuestao04;

import java.util.Scanner;

public class TestaPilha {
	public static void main(String[] args) {
		TestaPilha testaLista = new TestaPilha();
		ListaPilha lista = new ListaPilha();
		int opcao = 0;
		boolean verifVazia = true;
//
		Scanner sc = new Scanner(System.in);

		/*4. Projete uma estrutura do tipo pilha para guardar informações de páginas da
		web visitadas.
		a) Escreva a função inicializarPilha
		b) Escreva a função push para adicionar um elemento à pilha.
		c) Escreva a função pop para remover
		*/
		

	}

	public void push(ListaPilha listaEncadeada) {
		Site site = new Site();
		
		listaEncadeada.adicionar(site); 
	}

	public void pop(ListaPilha listaEncadeada) {
		listaEncadeada.remover();

	}
	
	public void verifVazia(ListaPilha listaEncadeada) {
		listaEncadeada.verifVazia();

	}

	
}