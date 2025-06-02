package AtividadeAvaliativa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaEntrevista {

	/*Implemente um programa que contemple uma fila de contatos (nome)  para realização de uma entrevista;

	–As opções do programa devem ser:

	• Inserir Entrevistado: Deve solicitar ao usuário os dados e incluir o contato na fila;

	• Próximo Entrevistado: Deverá pegar o candidato do Início da Fila, removê-lo

	• Sair.
	*/
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			
			System.out.println("Escolha uma das seguintes opções:\n1) Inserir Entrevistado"
					+ "\n2) Proximo Candidato\n3) Sair");
			
			switch (opcao) {
			case 1:
				//• Inserir Entrevistado: Deve solicitar ao usuário os dados e incluir o contato na fila;
				System.out.println("Informe seu nome!");
				fila.add(sc.next());
				System.out.println("Contato adicionado com sucesso.");
			case 2:
				//Próximo Entrevistado: Deverá pegar o candidato do Início da Fila, removê-lo
				
				
				
			case 3:
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		} while (opcao <= 3);
		
		
	}	
}
