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
		
		addElemente(pilha);
		
		print(pilha);
		
		System.out.println("\nRemovendo...");
		
		removeElemente(pilha);
		
		print(pilha);
		
		}
	
	public static Stack<String> inicializarPilha() {
		Stack<String> pilha = new Stack<String>();
		return pilha;
	}
	
	public static void addElemente(Stack<String> pilha) {
		pilha.push("a");
	}
	
	public static void removeElemente(Stack<String> pilha) {
		pilha.pop();
	}
	
	public static void print(Stack<String> pilha) {
		Iterator <String> it = pilha.iterator();
		
		if(!pilha.empty()){
			System.out.println("Essa é sua pilha: \n");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}else {
			System.out.println("\npilha vazia.");
		}
			
	}
}
