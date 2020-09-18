package tp3;

public class CuentaBanco {
	private int balance = 50;
	
		public CuentaBanco() {
	}
	public int getBalance() {
		return balance;
	}
	private void retiroBancario(int retiro) {
		balance = balance - retiro;
	}
	
	public synchronized void HacerRetiro(int cantidad,CuentaBanco cb)throws InterruptedException{
		if (cb.getBalance() >= cantidad) {
			System.out.println ( Thread.currentThread().getName() + " está realizando un retiro de: " + cantidad + ".");
			cb.retiroBancario(cantidad);
			System.out.println(Thread.currentThread().getName() +": Retiro realizado.");
			System.out.println(Thread.currentThread().getName() +": Losfondos son de: " + cb.getBalance());
			} else {
				System.out.println("No hay suficiente dinero en la cuentapara realizar el retiro Sr." +Thread.currentThread().getName());
				System.out.println("Su saldo actual es de" +cb.getBalance());
				}
			}
}
