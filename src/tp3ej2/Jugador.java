package tp3ej2;

public class Jugador {
	private int salud = 10;
	
	public Jugador() {}
	
	public synchronized int getSalud() {
		System.out.println(Thread.currentThread().getName()+": consulta por vida "+salud);
		return salud;
	}
	
	public synchronized void setSalud(int n) {
		salud = n;
		System.out.println(Thread.currentThread().getName()+" actualizo la vida a: "+ salud);
	}
}
