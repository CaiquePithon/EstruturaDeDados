package ListaFila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao02 {

	/*
	2- Implemente um programa que contemple uma fila de contatos para um
	callcenter. As opções do programa devem ser:
	a) Inserir Contato: Deve solicitar ao usuário os dados e incluir o contato na
	fila;*
	
	b) Próximo Contato: Deverá pegar o Contato do Início da Fila, removê-lo e
	mostrar os seus dados na tela para o usuário efetuar o contato com o
	cliente.
	c) Sair.
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> contato = new  LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		
		
		do {
			boolean entradaValida = false;
			System.out.println("Informe qual operação deseja: "
					+ "\n1) Inserir Contato\n2) Próximo Contato\n3) Sair");
			while(!entradaValida) {	
				if(sc.hasNextInt()) {
					opcao = sc.nextInt();
					entradaValida = true;
				}else {
					System.out.println("Entrada invalida! Por favor digite um"
							+ "numero Inteiro disponivel.");
					sc.next();
					System.out.println("Informe qual operação deseja: "
							+ "\n1) Inserir Contato\n2) Próximo Contato\n3) Sair");
				}
			}
			
			switch (opcao) {
			case 1: 
				addContato(contato);
				break;
			case 2: 
				proximoContato(contato);
				break;
			case 3: 
				break;
			default:
				System.out.println("Opção invalida");
			}
			
		} while (opcao != 3);
		
	}
	
	

	public static void addContato(Queue<String> contato) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dados de contato: ");
		
		contato.add(sc.next());
		System.out.println("\nCONTATO ADICIONADO");
		
	}
	
	public static void proximoContato(Queue<String> contato) {
		
		/*b) Próximo Contato: Deverá pegar o Contato do Início da Fila, removê-lo e
		mostrar os seus dados na tela para o usuário efetuar o contato com o
		cliente.*/
		if(contato.isEmpty()) {
			System.out.println("Sem contatos cadrastrados");
		}else {
			System.out.println(contato.poll());
		}
		
		
	}
	
	
}
