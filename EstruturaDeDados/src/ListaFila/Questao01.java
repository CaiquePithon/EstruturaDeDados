package ListaFila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao01 {

	/*1- Crie um programa em java para gerenciar uma playlist da sua festa em
	casa de final de ano. Organize as músicas que deverão ser todas na ordem e
	insiram em uma fila.
	a) Inserir musica
	b) Consultar música
	c) Remover música
	d) Sair.*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
		boolean entradaValida = false;
		Queue<String> playlist = new LinkedList<String>();
		
		Scanner sc = new Scanner(System.in);
		do {
			entradaValida = false;
			
			System.out.println("Escolha uma dessas opções:\n1) Inserir Música\n2) Consultar Música\n3) Remover Música"
					+ "\n4) Sair ");
			while(!entradaValida) {	
				if(sc.hasNextInt()) {
					opcao = sc.nextInt();
					entradaValida = true;
				}else {
					System.out.println("Entrada invalida! Por favor digite um"
							+ "numero Inteiro disponivel.");
					sc.next();
					System.out.println("Escolha uma dessas opções:\n1) Inserir Música\n2) Consultar Música\n3) Remover Música"
							+ "\n4) Sair ");
				}
			}
			
			
			
			switch (opcao) {
			case 1: 
				System.out.println("Informe uma musica: ");
				playlist.add(sc.next());
			
				break;
			case 2: 
				System.out.println("");
				if(!playlist.isEmpty()) {
					Iterator<String> it = playlist.iterator();
					System.out.println("");
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}else {
					System.out.println("A playlist está vazia.");
				}
				System.out.println("");
				break;
			case 3: 
				System.out.println("");
				if(playlist.size()>0) {
					playlist.remove();
				}else {
					System.out.println("A playlist está vazia.");
				}
				System.out.println("");
				break;
			case 4:
				break;
			default:
				System.out.println("Opção invalida");
			}
		} while(opcao !=4);
	}
}
