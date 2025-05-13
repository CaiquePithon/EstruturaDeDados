package ListaPilhaQuestao02;

import java.util.Scanner;

/*

2. Escreva um programa que utiliza um objeto Pilha para determinar se uma
string é um Palíndromo (isto é, a string é escrita identicamente de trás para
frente). O programa deve ignorar espaços e pontuação.

*/

public class TestaPilha {
	public static void main(String[] args) {
		TestaPilha testaLista = new TestaPilha();
		ListaPilha lista = new ListaPilha();
		
		String frase  = "socorram-me, subi no onibus em marrocos";
		
		if (ehPalindromo(lista, testaLista, frase)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
	}

	public static boolean ehPalindromo(ListaPilha listaEncadeada, TestaPilha testaLista,String texto) {
        
		String textoLimpo = texto.replaceAll("[^a-zA-Z]", "");

		for (int i = 0; i < textoLimpo.length(); i++) {
			Letra letra = new Letra();
			letra.setLetra(textoLimpo.charAt(i));
			
			listaEncadeada.adicionar(letra); 
        }
		

        for (int i = 0; i < textoLimpo.length(); i++) {
            if (textoLimpo.charAt(i) != listaEncadeada.getFim().getDado().letra) {
                return false; 
            }
            listaEncadeada.remover();
        }

        return true;
    }
}
