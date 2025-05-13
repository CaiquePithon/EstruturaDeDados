package ListaPilhaQuestao04;


public class ListaPilha {
	
	private Celula inicio;
	private Celula fim;
	private Celula atual;
	
	public void adicionar(Site dado) {
		Celula celula = new Celula();
		celula.setDado(dado);
		
		if(inicio == null && fim == null) {
			inicio = celula;
			fim = celula;
		}else {			
			fim.setProximo(celula);
			fim = celula;
			fim.setProximo(null);
		}
	}
	
	public boolean temProximo() {
		if(inicio == null) {
			return false;
		}else if (atual == null) {
			atual = inicio;
			return true;
		}else if(atual.getProximo() != null) {
			boolean temProximo = inicio.getProximo() != null? true : false;
			atual = atual.getProximo();
			return temProximo;
		}else {
			atual = atual.getProximo();
			return false;
		}
	}
	
	public boolean temAnterior() {
		if(inicio == null) {
			return false;
		}else if (atual == null) {
			atual = fim;
			return true;
		}else if(atual.getAnterior() != null) {
			boolean temAnterior = fim.getAnterior()!= null? true : false;
			atual = atual.getAnterior();
			return temAnterior;
		}else {
			atual = atual.getAnterior();
			return false;
		}
	}
	
	public void remover() {
		if(inicio.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.inicio);
			fim = celula;
			celula.setProximo(null);
		}else {
			inicio = null;
			fim = null;
		}
	}
	public void removerTodos() {
		inicio = null;
		fim = null;
	}
	
	private Celula recuperarPenultimo(Celula celula) {
		if(celula.getProximo().equals(fim)) {
			return celula;
		}
		
		return recuperarPenultimo(celula.getProximo());
	}
	
	private Celula recuperar(Celula celula) {
		if(celula.getAnterior().equals(inicio)) {
			return celula;
		}
		
		return recuperar(celula.getAnterior());
	}
	
	public boolean verifVazia() {
		if(inicio == null && fim == null) {
			return true;
		}else {
			return false;
		}
	}

	public Celula getInicio() {
		return inicio;
	}


	public Celula getFim() {
		return fim;
	}

	public Celula getAtual() {
		return atual;
	}	
	
}
