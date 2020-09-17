package tp2;

import java.math.*;

public class PingPong extends Thread {
	private int delay;	//info de las iteraciones
	private Dato miD;	//para mantener el total
	private int miCta = 0;	//para contar iteraciones
	
	//Constructor1	redefine al constructor de thread
	public PingPong(String cartel, int cantMs) {
		super(cartel);
		this.delay = cantMs;
	}
	
	//Constructor2 que utiliza el constr. 1
	public PingPong(String cartel, int cantMs, Dato dd) {
		this(cartel, cantMs);
		this.miD = dd;
	}
	
	public void run() {
		for (int i = 1; i<delay; i++) {
			//System.out.println(this.getName());
			miCta++;
			this.miD.contar();
		}
		System.out.println(miCta + " veces " + this.getName());
	}
	public static void main(String arg[]) throws InterruptedException {
		Dato cuenta = new Dato();
		PingPong t1 = new PingPong ("PING", (int) (Math.random()*2300), cuenta);
		PingPong t2 = new PingPong ("PONG", (int) (Math.random()*2000), cuenta);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(Thread.currentThread() + "chau-chau.adios");
		System.out.println(" dato "+ cuenta.obtenerValor());
	}
}
