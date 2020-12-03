package Escalonador;

import java.util.PriorityQueue;
import java.util.Queue;

public class Prioridade {
	public static final int PROD = 0; //maior
	public static final int BATCH = 1; //intermediario
	public static final int FREE = 3;  //menor
	
	// processos    0 1 2 3 
	// prioridades  0 1 1 3
	//execução:  1 -> 2 -> 0 -> 3 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Fila> fila = new PriorityQueue<>();
		
		fila.add(new Fila(0, BATCH));
		fila.add(new Fila(1, PROD));
		fila.add(new Fila(2, BATCH));
		fila.add(new Fila(3, FREE));
		
		Execucao execucao = new Execucao((PriorityQueue<Fila>) fila);
		

		Thread t1 = new Thread(execucao);
		t1.start();
		
	}

}
