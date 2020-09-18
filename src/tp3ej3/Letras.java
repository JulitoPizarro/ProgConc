package tp3ej3;

public class Letras implements Runnable {
	private char letra;
	private Turnos turno;
	private int prioridad;
	
	public Letras(char l, Turnos t, int p) {
		letra = l;
		turno = t;
		prioridad = p;
	}
	
	public void run() {
		boolean f;
        for (int i=0; i<100; i++){
            f=false;
            while (!f) {
                if (turno.getTurno()==prioridad){
                    turno.imprimir(letra, prioridad);
                    f=true;
                }
                else{Thread.yield();}
            }
        }
	}
}
