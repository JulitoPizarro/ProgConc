package tp2;

public class Dato {
	private int valor;
	
	public Dato() {
		valor = 0;
	}

	public synchronized void contar(){
	    valor++;
	}

	int obtenerValor(){
	     return valor;
	}
}
