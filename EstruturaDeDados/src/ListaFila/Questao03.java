package ListaFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
3- Crie um programa em java para gerenciar a fila de supermercado:
a) Inserir cliente
b) Remover cliente
c) Consultar quantos clientes tem na fila
d) Sair.
*/

public class Questao03 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		do {
			
			imprimir();
			opcao = lerInteiro(sc);
			
			switch (opcao){
			case 1: 
				System.out.println("Informe o nome do cliente que deseja adicionar:");
				fila.add(sc.next());
				break;
			case 2:
				if(!fila.isEmpty()) {
					fila.remove();
				}else {
					System.out.println("Fila vazia!");
				}
				break;
			case 3:
				if(!fila.isEmpty()) {
					Iterator<String> it = fila.iterator();
					System.out.println("");
					while(it.hasNext()) {
						System.out.println(it.next());
					}
					System.out.println("");
				}else {
					System.out.println("Fila vazia!");
				}
				break;
			case 4:	
				break;
			default:
				System.out.println("Opção Invalida.");			}
			
		} while (opcao != 4);
	}
	
	public static void imprimir() {
		System.out.println("Ecolha uma das seguintes opções:\n1 - Inserir Cliente"
				+ "\n2 - Remover Cliete\n3 - Consultar quantos Clientes tem na fila"
				+ "\n4 - Sair");
	}
	
	public static int lerInteiro(Scanner sc) {
		boolean entradaValida = false;
		int opcao = 0;
		while(!entradaValida) {	
			if(sc.hasNextInt()) {
				opcao = sc.nextInt();
				entradaValida = true;
			}else{
				System.out.println("Digite um numero inteiro positivo.");
				sc.next();
				imprimir();
			}
			
		}
		return opcao;
	}
	
}
