package ListaFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*
4- Crie um programa em java para gerenciar a fila de uma sala de aula,
onde deverá está ordenada por idade
a) Inserir alunos
b) Consultar alunos
c) Sair.*/

public class Questao04 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		
		do {
			
			imprimir();
			opcao = lerInteiro(sc);
			
			switch (opcao){
			case 1: 
				System.out.println("Informe a Idade do aluno:");
				fila.add(lerInteiro(sc));
				break;
			case 2:
				
				if(!fila.isEmpty()) {
					List<Integer> lista = new ArrayList<>(fila);
					Collections.sort(lista);
					fila.clear();
					fila.addAll(lista);
					Iterator<Integer> it = fila.iterator();
					System.out.println("");	
					while(it.hasNext()) {
						System.out.println(it.next());
					}
					System.out.println("");
				}else {
					System.out.println("Fila vazia!");
				}
				break;
			case 3:	
				break;
			default:
				System.out.println("Opção Invalida.");			}
			
		} while (opcao != 3);
	}
	
	public static void imprimir() {
		System.out.println("Ecolha uma das seguintes opções:\n1 - Inserir Aluno"
				+ "\n2 - Consultar Alunos\n3 - Sair");
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