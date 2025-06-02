package ListaFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
5- Escreva um programa em java utilizando pilhas, que apresente as
seguintes opções no menu:
a) Inserir Paciente
b) Atender paciente
c) Verificar se há paciente
d) Indicar o próximo paciente a ser atendido
e) Quantidade de pacientes que aguardam atendimento
f) Sair
*/


public class Questao05 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		String p = "";
		
		do {
			
			imprimir();
			opcao = lerInteiro(sc);
			
			switch (opcao){
			case 1: 
				System.out.println("Informe o nome do Paciente: ");
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
				if(!fila.isEmpty()) 
					System.out.println("Com "+ p +".");
				else
					System.out.println("Sem paciente.");
				break;
			case 4:
				if(!fila.isEmpty()) {
					Iterator<String> it = fila.iterator();
					System.out.println("");	
					if(it.hasNext()) 
						System.out.println(it.next());
					System.out.println("");
				}else
					System.out.println("Fila Vazia!");
				break;
			case 5:
				if(!fila.isEmpty()) {
					
					p = (fila.size() > 1) ? "Pacientes" : "Paciente";
					System.out.println("A Quantidade de "+ p +" é de: "+fila.size()); 
				}else {
					System.out.println("Fila vazia!");
				}
				break;
			case 6:
				break;
			default:
				System.out.println("Opção Invalida.");			}
			
		} while (opcao != 6);
	}
	
	public static void imprimir() {
		System.out.println("Ecolha uma das seguintes opções:\n1 - Inserir Paciente"
				+ "\n2 - Atender Paciente\n3 - Verificar se a Paciente\n4 - Proximo Paciente a ser Atendido"
				+ "\n5 - Quantidade de Pacientes a Atender\n6 - Sair");
	}
	
	public static int lerInteiro(Scanner sc) {
		boolean entradaValida = false;
		int num = 0;
		while(!entradaValida) {	
			if(sc.hasNextInt()) {
				num = sc.nextInt();
				entradaValida = true;
			}else{
				System.out.println("Digite um numero inteiro positivo.");
				sc.next();
				imprimir();
			}
			
		}
		return num;
	}
}
