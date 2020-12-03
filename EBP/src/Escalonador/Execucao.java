package Escalonador;

import java.util.PriorityQueue;

public class Execucao implements Runnable {
	
	private PriorityQueue<Fila> fila;
	
	
	public Execucao(PriorityQueue<Fila> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {
		while (!fila.isEmpty()) {
			try {
				System.out.println(fila.remove() + "executando");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Todos os processos foram executados");
	}

}
