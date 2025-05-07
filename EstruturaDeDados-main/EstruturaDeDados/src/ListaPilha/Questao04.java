package ListaPilha;

import java.util.Stack;

/*4. Projete uma estrutura do tipo pilha para guardar informações de páginas da
web visitadas.
a) Escreva a função inicializarPilha
b) Escreva a função push para adicionar um elemento à pilha.
c) Escreva a função pop para remover
*/

public class Questao04 {

	public static void main(String[] args) {
		
		inicializarPilha();
	}
	
	public static void inicializarPilha() {
		Stack<String> pilha = new Stack<String>();
	}
	
	public static void addElemento(Stack<String> pilha) {
		pilha.push("a");
	}
	
	public static void removeElemente(Stack<String> pilha) {
		pilha.pop();
	}
}
