package DesafioArvore;

public class Arvore {
    private No raiz;

    public void inserir(int valor) {
        if (valor <= 0) {
            System.out.println("número inválido! informee um número maior que zero ");
            return;
        }

         No novo = new No(valor);

            if (raiz == null) {
            raiz = novo;
         } else {
            No atual = raiz;
            while (true) {
            if (valor < atual.getValor()) {
                if (atual.getEsq() == null) {
                    atual.setEsq(novo);
                   break;
                    } else {
                        atual = atual.getEsq();
                    }
            } else if (valor > atual.getValor()) {
                if (atual.getDir() == null) {
                    atual.setDir(novo);
                     break;
                } else {
                  atual = atual.getDir();
                    }
                } else {
                System.out.println("valor já existe na árvore ");
                break;
                }
            }
        }
    }

      public void preOrdem(No n) {
         if (n != null) {
            System.out.print(n.getValor() +  " ");
            preOrdem(n.getEsq());
            preOrdem(n.getDir());
        }
    }

         public No getRaiz() {
             return raiz;
      }
}