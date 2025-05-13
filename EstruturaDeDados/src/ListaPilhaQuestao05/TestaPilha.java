package ListaPilhaQuestao05;

import java.util.Scanner;

public class TestaPilha {
	public static void main(String[] args) {
		
		TestaPilha testaLista = new TestaPilha();
		ListaPilha lista = new ListaPilha();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);

		/*5. Projete uma estrutura de pilha para guardar passo a passo de como efetuar
		uma determinada tarefa.
		a) Escreva a função criar a pilha
		b) Adicione tarefas na pilha
		c) Remova tarefas da pilha
		d) Indique se a tarefa for concluída quando a pilha estiver vazia.
		*/
		
		do {
			System.out.println("\nEscolha uma opção:\n1 - Adicionar Tarefa\n2 - Remover Tarefa"
					+  "\n3 - Sair\\");
			opcao = sc.nextInt();

			switch (opcao) {
				case 1:
					testaLista.addTarefa(lista);

					System.out.println("Tarefa adicionada com sucesso!");

					break;
				case 2:
					if(lista.verifVazia()) {
						System.out.println("Tarefas Concluidas");
					}else {
						lista.remover();	
					}
					
					break;

				case 3:
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}

		} while (opcao != 3);

		sc.close();
	}

	public ListaPilha createLista() {
		ListaPilha lista = new ListaPilha();
		return lista;
	}
	
	public void addTarefa(ListaPilha listaEncadeada) {
		Scanner sc = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		System.out.println("\nDigite a sua  tarefa: ");
		tarefa.setDescricao(sc.next());
		
		listaEncadeada.adicionar(tarefa); 
	
	}

	
	public void verifVazia(ListaPilha listaEncadeada) {
		listaEncadeada.verifVazia();

	}

	
}