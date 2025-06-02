package Arvore;

public class ArvoreBinaria {

	private No raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	// vamos fazer o metodo inserir (raiz, esq, dir).. logo serao 3 metodos
	
	public boolean insereRaiz(int valor) {
		//qual cuidado devemos ter em toda a estrutura de dados?
		if(raiz != null) {
			return false;
		}
		
		No novoNo = new No();
		novoNo.setConteudo(valor);
		novoNo.setDir(null);
		novoNo.setEsq(null);
		
		raiz = novoNo;
		return true;
	}
	
	// metodo para pensar nas buscas
	public boolean vazia() {
		return(raiz == null);
	}
	
	//vou fazer um metodo generico de busca que vamos utilizar em varias partes.... esse metodo sera recursivo
	private No busca (No T, int valor) {
		if(T == null) {
			return null;
		}
		//condição de parada 
		if(T.getConteudo() == valor) {
			return T; //retorna pois o no foi encontrado
		}
		
		No aux = busca(T.getEsq(), valor);
		if(aux ==null) 
			aux = busca(T.getDir(), valor);
		return aux;			
		
	}
	
	//vamos criar um metodo so para retornar as referencias de hierarquias
	public No busca(int valor) {
		if(vazia()) 
			return null;
		return busca(raiz,valor);
	}
	
	
	//tratar das demais partes. inserir na esquerda e inseria na direita
	public boolean insereEsquerda (int vPai, int vFilho){
		//toda vez que vamos inserir em qualquer estrutura... qual pergunta é ser feita?
		//sera que o elemento exixte???
		No filho = busca(vFilho);
		if(filho != null) {
			return false; //esse retorno foi adicionado para garantir n inserir o elemento ja existente
		}
		return true;
	}
}
