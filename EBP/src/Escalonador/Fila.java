package Escalonador;


public class Fila implements Comparable<Fila>{
	private int processo;
	private int prioridade;
	
	public Fila(int processo, int prioridade) {
		super();
		this.processo = processo;
		this.prioridade = prioridade;
	}
	
	@Override
	public int compareTo(Fila o) {
		if (prioridade > o.prioridade) {
			return 1;
		}else if (prioridade < o.prioridade) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Fila [processo=" + processo + ", prioridade=" + prioridade + "]";
	}

	public int getProcesso() {
		return processo;
	}

	public void setProcesso(int processo) {
		this.processo = processo;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	
}
