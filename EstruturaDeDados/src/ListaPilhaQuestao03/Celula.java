package ListaPilhaQuestao03;

public class Celula {

	private Tarefa dado;
	private Celula proximo;
	private Celula anterior;
	
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Tarefa getDado() {
		return dado;
	}
	public void setDado(Tarefa dado) {
		this.dado = dado;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
}
