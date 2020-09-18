package tp3;

public class VerificarCuenta implements Runnable {
	private CuentaBanco cb = new CuentaBanco();
	
			public void run() {
				for (int i = 0; i <= 3; i++) {
					try {
						cb.HacerRetiro(10, cb);
						Thread.sleep(1000);
						if(cb.getBalance() < 0){
							System.out.println("La cuenta está sobregirada.");
						}
			} catch (InterruptedException ex) {
				//Logger.getLogger(VerificarCuenta.class.getName()).
				//log(Level.SEVERE, null, ex); }
				}
			}
		}
}
