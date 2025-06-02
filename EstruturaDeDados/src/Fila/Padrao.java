package Fila;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Padrao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vamos trabalhar com uma fila de numeros
		Queue<Integer> fila = new LinkedList<Integer>();
		
		//vamos ver se a fila esta vazia
		
		if(fila.isEmpty()) {
			System.out.println("Fila esta vazia");
		}else {
			System.out.println("Fila contém elemetos");
		}
		
		//vamos adicionar elementos
		System.out.println("Inserindo elementos na fila");
		fila.add(1);
		fila.offer(2);
		fila.add(3);
		fila.add(4);
		fila.add(5);
		fila.add(6);

		if(fila.isEmpty()) {
			System.out.println("Fila esta vazia");
		}else {
			System.out.println("Fila contem elemetos");
		}
		
		System.out.println("O tamanho da sua fila é: " + fila.size());

		if(fila.size()>0) {
			fila.remove();
		}else {
			System.out.println("Sua fila esta vazia.");
		}
		
		System.out.println("O tamanho da sua fila após remoção é: " + fila.size());
		
		//percorrer a fila, vamos usar o iterator
		
		Iterator<Integer> it = fila.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}