package ListaPilha;

import java.util.Iterator;
import java.util.Stack;

/*4. Projete uma estrutura do tipo pilha para guardar informações de páginas da
web visitadas.
a) Escreva a função inicializarPilha
b) Escreva a função push para adicionar um elemento à pilha.
c) Escreva a função pop para remover
*/

public class Questao04 {

	public static void main(String[] args) {
		
		System.out.println("Criando pilha... Pilha criada");
		
		Stack<String> pilha = inicializarPilha();
		
		System.out.println("Adicionando...\n");
		
		push(pilha, "Google visitado");
		push(pilha, "Youtube visitado");
		
		
		print(pilha);
		
		pop(pilha);
		
		print(pilha);
		
		pop(pilha);
		print(pilha);
		}
	
	public static Stack<String> inicializarPilha() {
		Stack<String> pilha = new Stack<String>();
		return pilha;
	}
	
	public static void push(Stack<String> pilha, String l) {
		pilha.push(l);
	}
	
	public static void pop(Stack<String> pilha) {
		System.out.println("\nRemovendo...");
		pilha.pop();
	}
	
	public static void print(Stack<String> pilha) {
		if(!pilha.empty()){
			for (int i = 1; pilha.size()-i >= 0; i++) {
				System.out.println(pilha.get(pilha.size()-i));
			}
		}else {
			System.out.println("\nnenhum site visitado");
		}
			
	}
}
