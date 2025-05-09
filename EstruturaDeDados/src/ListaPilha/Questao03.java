package ListaPilha;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/*3. Crie um programa que gerencie uma PILHA de TAREFAS a serem
cumpridas. As tarefas são strings que descrevem uma ação a ser executada. O
usuário deverá ter duas opções:
a) Inserir tarefa na pilha;
b) Obter a próxima tarefa da pilha.
*/

public class Questao03 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println("\nEscolha uma opção:\n1 - Inserir Tarefa na Pilha \n2 - Obter a próxima tarefa da pilha");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: 
				System.out.println("Descreva sua tarefa: ");
				pilha.add(sc.next());
				break;
			case 2: 
				System.out.println(pilha.peek());
				break;
			case 3:
				
				System.out.println(pilha.get(0));
				System.out.println(pilha.size());
				System.out.println(pilha.get(pilha.size()-2));
				
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
			
		} while (opcao != 4);
	}
}
