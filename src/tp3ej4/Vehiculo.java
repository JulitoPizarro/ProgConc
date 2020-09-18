package tp3ej4;

public class Vehiculo {
	protected int modelo;
	protected String patente;
	protected String marca;
	protected int kmFaltantesParaService;
	protected int capacidadCombustible;
	protected Surtidor surt;
	
	public Vehiculo(int m, String p, String marc, int kmf, int cap, Surtidor s) {
		modelo = m;
		patente = p;
		marca = marc;
		kmFaltantesParaService = kmf;
		capacidadCombustible = cap;
		surt = s;
	}

	public int getModelo() {
		return modelo;
	}

	public String getPatente() {
		return patente;
	}

	public String getMarca() {
		return marca;
	}

	public int getKmFaltantesParaService() {
		return kmFaltantesParaService;
	}

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}
	public void setCapacidadCombustible(int cap) {
		capacidadCombustible = cap;
	}

	public void setKmFaltantesParaService(int km) {
		kmFaltantesParaService = km;
	}
	
}
