package ListaPilhaQuestao01;

import java.util.Scanner;

public class TestaLista {
	public static void main(String[] args) {
		TestaLista testaLista = new TestaLista();
		ListaPilha lista = new ListaPilha();
		int opcao = 0;
		boolean verifVazia = true;
//
		Scanner sc = new Scanner(System.in);

		/*
		1. Crie um programa em java para gerenciar os livros que deverão ser lidos
		durante as férias e para a solução do problema utilize o conceito de pilhas,
		tenha as seguintes opções:
		a) Inserir na Pilha
		b) Consultar na Pilha
		c) Remover na Pilha
		d) Esvaziar na Pilha
		e) Sair.
		*/
		
		do {
			System.out.println("\nEscolha uma opção:\n1 - Adicionar Livro\n2 - Remover Livro\n3 - Consultar Pilha"
					+  "\n4 - Esvaziar Pilha\n5 - Sair\\");
			opcao = sc.nextInt();

			switch (opcao) {
				case 1:
					Livro livro = new Livro();
					System.out.println("\nDigite o nome do Livro: ");
					livro.setNome(sc.next());
					lista.adicionar(livro);
					System.out.println("Livro adicionado com sucesso!");

					break;
				case 2:
					if(lista.verifVazia()) {
						System.out.println("Pilha vazia vazia");
					}else {
						System.out.println("\nRemovendo o ultimo Livro da pilha...");
						testaLista.remover(lista);
					}
					
					break;
				case 3:
					if(lista.verifVazia()) {
						System.out.println("Pilha vazia vazia");
					}else {
						System.out.println("\nVamos ver a pilha de Livros:\n");
						while (lista.temProximo()) {							
							System.out.println(lista.getAtual().getDado().getNome());
						}
						/*while (lista.temAnterior()) {							
							System.out.println(lista.getAtual().getDado().getNome());
						}*/
					}
					
					break;
				case 4:
					System.out.println("\nRemovendo todos os Livros da pilha...");
					testaLista.removerTudos(lista);
					break;
				case 5:
					break;

				default:
					System.out.println("Opção inválida!");
					break;
			}

		} while (opcao != 7);

		sc.close();
	}

	public void addLivro(ListaPilha listaEncadeada) {
		Livro livro = new Livro();
		
		listaEncadeada.adicionar(livro); 
	}

	public void remover(ListaPilha listaEncadeada) {
		listaEncadeada.remover();

	}
	public void removerTudos(ListaPilha listaEncadeada) {
		listaEncadeada.removerTodos();

	}
	
	public void verifVazia(ListaPilha listaEncadeada) {
		listaEncadeada.verifVazia();

	}

	
}