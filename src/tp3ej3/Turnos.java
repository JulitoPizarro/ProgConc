package tp3ej3;

public class Turnos {
	private int turno;
	private int limite;
	
	public Turnos(int limit) {
		turno = 1;
		limite = limit;
	}
	
	public synchronized int getTurno() {
		return turno;
	}
	
	private void pasarTurno() {
		if(turno < limite)
			turno++;
		else
			turno = 1;
	}
	
	public synchronized void imprimir(char caracter, int pase){

        if (turno == pase){
            for (int i = 1; i <= pase; i++){
                System.out.print(caracter);
            }
            this.pasarTurno();
        }
}

}
