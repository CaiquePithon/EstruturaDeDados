package DesafioArvore;

import java.util.Scanner;

public class TesteArvore {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Arvore arvore = new Arvore();
        int opcao;
        int contador =0;

        
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Inserir a raiz");
            System.out.println("2 - Inserir números na árvore");
            System.out.println("3 - Consultar os números inseridos (pré-ordem)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                    if (arvore.getRaiz() != null) {
                        System.out.println("a raiz já foi inserida ");
                    } else {
                        System.out.print("digite o valor da raiz: ");
                        int valorRaiz = entrada.nextInt();
                        arvore.inserir(valorRaiz);
                        if (valorRaiz > 0) contador++;
                    }
                    break;

            case 2:
                    if (arvore.getRaiz() == null) {
                        System.out.println("insira a raiz primeiro ");
                    } else if (contador >= 10) {
                        System.out.println("limite de 10 números atingido");
                    } else {
                        System.out.print("digite o número para inserir: ");
                        int valor = entrada.nextInt();
                        arvore.inserir(valor);
                        if (valor > 0) contador++;
                    }
                    break;

            case 3:
                    if (arvore.getRaiz() == null) {
                        System.out.println("árvore vazia");
                    } else {
                        System.out.print("pré-ordem: ");
                        arvore.preOrdem(arvore.getRaiz());
                        System.out.println();
                    }
                    break;

            case 4:
                    System.out.println("programa encerrado");
                    break;

           default:
                    System.out.println("opção inválida");
            }

               } while (opcao != 4);

        entrada.close();
    }
}