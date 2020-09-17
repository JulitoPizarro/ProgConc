package tp2;

public class RunnableCdor implements Runnable {
	Dato unContador;
	public RunnableCdor(Dato elCdor) {
		unContador = elCdor;
	}
	
	public void run() {
		for(int i=0; i<10000; i++) {
			unContador.contar();
		}
	}
}
