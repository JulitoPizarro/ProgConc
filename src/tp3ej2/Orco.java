package tp3ej2;

public class Orco implements Runnable {
	private Jugador player;
	
	public Orco(Jugador ply) {
		player = ply;
	}
	
	public void run(){
		player.setSalud(player.getSalud()-3);
	}

}
