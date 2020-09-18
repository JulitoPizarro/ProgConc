package tp3ej4;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Surtidor estacion = new Surtidor("centro");
		Auto a1 = new Auto ( 1998, "ARS 349", "FORD", 226, 60, estacion);
		Auto a2 = new Auto ( 2009, "HGP 562", "CHEVROLET", 1653, 60, estacion);
		Auto a3 = new Auto ( 2015, "AA 234 DF", "FIAT", 1269, 80, estacion);
		Auto a4 = new Auto ( 2011, "LFO 523", "BMW", 4689, 80, estacion);
		Auto a5 = new Auto ( 2019, "AD 845 UP", "TOYOTA", 1268, 90, estacion);
		
		Auto[] colAutos = {a1,a2,a3,a4,a5};
		Thread[] autos = new Thread[5];
		
		for(int i = 0; i<5; i++) {
			autos[i] = new Thread(colAutos[i]);
		}
		
		for(Thread hilo: autos) {
			hilo.start();;
		}
		for(Thread hilo: autos) {
			hilo.join();
		}
		
	}

}
