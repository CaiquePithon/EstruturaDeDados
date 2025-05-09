package ListaPilhaQuestao02;

public class Celula {

	private Letra dado;
	private Celula proximo;
	private Celula anterior;
	
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Letra getDado() {
		return dado;
	}
	public void setDado(Letra dado) {
		this.dado = dado;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
}
