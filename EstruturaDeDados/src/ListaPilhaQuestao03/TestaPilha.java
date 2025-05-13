package ListaPilhaQuestao03;

import java.util.Scanner;

public class TestaPilha {
	public static void main(String[] args) {
		TestaPilha testaLista = new TestaPilha();
		ListaPilha lista = new ListaPilha();
		int opcao = 0;
		boolean verifVazia = true;
//
		Scanner sc = new Scanner(System.in);

		/*3. Crie um programa que gerencie uma PILHA de TAREFAS a serem
		cumpridas. As tarefas são strings que descrevem uma ação a ser executada. O
		usuário deverá ter duas opções:
		a) Inserir tarefa na pilha;
		b) Obter a próxima tarefa da pilha.
		*/
		
		do {
			System.out.println("\nEscolha uma opção:\n1 - Adicionar Tarefa\n2 - Consultar Pilha"
					+  "\n3 - Sair\\");
			opcao = sc.nextInt();

			switch (opcao) {
				case 1:
					Tarefa tarefa = new Tarefa();
					System.out.println("\nDigite a sua  tarefa: ");
					tarefa.setDescricao(sc.next());
					lista.adicionar(tarefa);
					System.out.println("Livro adicionado com sucesso!");

					break;
				case 2:
					if(lista.verifVazia()) {
						System.out.println("Pilha vazia vazia");
					}else {
						System.out.println("\nVamos ver a pilha de Tarefas:\n");
						
						if (lista.temProximo()) {							
							System.out.println(lista.getAtual().getProximo().getDado().descricao);
						}else {
							System.out.println(lista.getAtual().getDado().getDescricao());
						}
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

	public void addTarefa(ListaPilha listaEncadeada) {
		Tarefa tarefa = new Tarefa();
		
		listaEncadeada.adicionar(tarefa); 
	}

	
	public void verifVazia(ListaPilha listaEncadeada) {
		listaEncadeada.verifVazia();

	}

	
}