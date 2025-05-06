package Pilha;

import java.util.Iterator;
import java.util.Stack;

public class Aula01 {
	
	public static void main(String[] args) {

		//criar uma pilha 
		Stack<String> pilha = new Stack<String>();
		
		//vamos verificar se a pilha esta vazia
		System.out.println("Pilha vazia utilizando o empty " + pilha.empty());
		System.out.println("Pilha vazia utilizando o isempty " + pilha.isEmpty());
		
		if(!pilha.empty()) {
			System.out.println("Pilha não esta vazia");
		}else {
			System.out.println("Pilha  esta vazia");
		}
		System.out.println("Vamos preencher a pilha");
		
		//vamos brincar de popular a pilha
		pilha.push("ADRIAN");
		pilha.push("Iady");
		pilha.push("Elton");
		pilha.push("Itauan");
		pilha.add("antonio");
		pilha.addElement("Caique");

		
		System.out.println("Depois da inserção");
		
		if(!pilha.empty()) {
			System.out.println("Pilha não esta vazia");
		}else {
			System.out.println("Pilha  esta vazia");
		}
		
		System.out.println("O tamanho da sua pilha é: " + pilha.size());
		
		pilha.addElement("Miguel");
		
		System.out.println("O tamanho da sua pilha é: " + pilha.size());
		pilha.pop();
		pilha.pop();
		System.out.println("O tamanho da sua pilha é: " + pilha.size());
		System.out.println("Quem é o elemento topo " + pilha.peek());
		pilha.remove(pilha.peek());
		System.out.println("Quem é o elemento topo " + pilha.peek());
		
		Iterator<String> it = pilha.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}