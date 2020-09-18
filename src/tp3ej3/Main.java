package tp3ej3;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Turnos turno = new Turnos(3);
		Letras A = new Letras('A', turno, 1);
		Letras B = new Letras('B', turno, 2);
		Letras C = new Letras('C', turno, 3);
		
		Thread letraA = new Thread(A);
		Thread letraB = new Thread(B);
		Thread letraC = new Thread(C);
		
		letraA.start();
		letraB.start();
		letraC.start();
		
		letraA.join();
		letraB.join();
		letraC.join();
	}

}
