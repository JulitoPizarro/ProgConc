package tp3ej4;

public class Surtidor {
	private String nombre;
	private Auto autoActual;
	
	public Surtidor(String n) {
		nombre = n;
	}
	
	public synchronized void cargar(Auto auto) {
		System.out.println("Ingresa auto modelo: "+auto.getModelo());
		auto.setCapacidadCombustible(100);
		System.out.println("Auto " +auto.getMarca()+" patente "+auto.getPatente()+" saliendo de la estacion, vuelve a circular.");
	}

}
