package ListaPilhaQuestao04;

public class Celula {

	private Site dado;
	private Celula proximo;
	private Celula anterior;
	
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Site getDado() {
		return dado;
	}
	public void setDado(Site dado) {
		this.dado = dado;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
}
