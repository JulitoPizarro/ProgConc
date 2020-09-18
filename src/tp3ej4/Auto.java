package tp3ej4;

public class Auto extends Vehiculo implements Runnable {
	
	public Auto(int modelo, String patente, String marca, int kmFaltantes, int capacidadComb, Surtidor s) {
		super(modelo, patente, marca, kmFaltantes, capacidadComb, s);
	}

	public void run() {
		System.out.println("Auto " +marca+" patente "+patente+" circulando");
		while(capacidadCombustible>0) {
			capacidadCombustible--;
		}
		System.out.println("Auto " +marca+" patente "+patente+" sin combustible, va a la estacion");
		surt.cargar(this);
		
	}
}
