package ListaPilhaQuestao01;

public class Celula {

	private Livro dado;
	private Celula proximo;
	private Celula anterior;
	
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Livro getDado() {
		return dado;
	}
	public void setDado(Livro dado) {
		this.dado = dado;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
}
