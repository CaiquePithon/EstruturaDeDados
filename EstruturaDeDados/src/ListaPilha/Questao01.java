package ListaPilha;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/*1. Crie um programa em java para gerenciar os livros que deverão ser lidos
durante as férias e para a solução do problema utilize o conceito de pilhas,
tenha as seguintes opções:
a) Inserir na Pilha
b) Consultar na Pilha
c) Remover na Pilha
d) Esvaziar na Pilha
e) Sair.*/

public class Questao01 {

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println("\nEscolha uma opção:\n1 - Inserir na Pilha \n2 - Consultar na Pilha\n3 - "
					+ "Remover na Pilha\n4 - Esvaziar na Pilha\n5 - Sair\\");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: {
				System.out.println("Informe o nome do livro: ");
				livros.push(sc.next());
				break;
			}
			case 2: {
				Iterator<String> it = livros.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
			}
			case 3: {
				System.out.println("Removendo...");
				livros.pop();
				break;
			}
			case 4: {
				System.out.println("Esvaziando... ");
				livros.clear();
				break;
			}
			case 5: {
				System.out.println("Saindo...");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		} while (opcao != 5);
		
	}
}
