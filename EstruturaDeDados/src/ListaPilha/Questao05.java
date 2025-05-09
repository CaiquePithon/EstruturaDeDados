package ListaPilha;

import java.util.Iterator;
import java.util.Stack;

/*5. Projete uma estrutura de pilha para guardar passo a passo de como efetuar
uma determinada tarefa.
a) Escreva a função criar a pilha
b) Adicione tarefas na pilha
c) Remova tarefas da pilha
d) Indique se a tarefa for concluída quando a pilha estiver vazia.
*/

public class Questao05 {

	public static void main(String[] args) {
		
		Stack<String> task = createStack();
		
		System.out.println("Adicionano na Pilha... \n");
		
		task.add("Malhar");
		task.add("Guarda Bike");
		task.add("Ir de Bike ate a academia");
		task.add("Pegar a Bike");
		task.add("Sair de casa");
		task.add("Tomar Cafe");
		task.add("Tomar Banho");
		
		print(task);
		
		task.pop();
		task.pop();
		task.pop();
		task.pop();
		
		print(task);
		
		task.pop();
		task.pop();
		task.pop();
		
		print(task);
		
	}
	
	public static Stack <String> createStack(){
		Stack<String> a = new Stack<String>();
		return a;
	}
	public static void print(Stack<String> pilha) {
		Iterator<String> it = pilha.iterator();
		
		if(!pilha.empty()) {
			System.out.println("Essa é sua Pilha: \n");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("");
		}else {
			System.out.println("\nTarefa Concluida!");
		}
		
	}
	
}
