package tp3ej2;

public class Curandero implements Runnable{
	private Jugador player;
	
	public Curandero(Jugador ply) {
		player = ply;
	}
	
	public void run() {
		player.setSalud(player.getSalud()+3);
	}
}
