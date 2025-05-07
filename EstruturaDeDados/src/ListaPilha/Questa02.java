package ListaPilha;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/*2. Escreva um programa que utiliza um objeto Pilha para determinar se uma
string é um Palíndromo (isto é, a string é escrita identicamente de trás para
frente). O programa deve ignorar espaços e pontuação.*/

public class Questa02 {
	
	 public static void main(String[] args) {
	        String frase = "socorram-me, subi no onibus em marrocos";

	        if (ehPalindromo(frase)) {
	            System.out.println("É um palíndromo!");
	        } else {
	            System.out.println("Não é um palíndromo.");
	        }
	    }
		
	
    public static boolean ehPalindromo(String texto) {
        
        String textoLimpo = texto.replaceAll("[^a-zA-Z]", "");

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < textoLimpo.length(); i++) {
            pilha.push(textoLimpo.charAt(i));
        }

        for (int i = 0; i < textoLimpo.length(); i++) {
            if (textoLimpo.charAt(i) != pilha.pop()) {
                return false; 
            }
        }

        return true;
    }
}
