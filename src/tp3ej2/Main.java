package tp3ej2;

public class Main {
	public static void main (String args[]) throws InterruptedException {
		Jugador p1 = new Jugador();
		Runnable orcoObj = new Orco(p1);
		Runnable curanderoObj = new Curandero(p1);
		Thread orco = new Thread(orcoObj, "ORCO");
		Thread curandero = new Thread(curanderoObj, "CURANDERO");
		
		orco.start();
		curandero.start();
		orco.join();
		curandero.join();
		
	}
}
