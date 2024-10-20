package ar.edu.unq.poo.Mp3;

public class SeleccionarSong implements EstadoReproductor{

	@Override
	public void play(Song song) {
		System.out.println("Playing the song...");
		song.setState(new ReproducirSong());
		
	}

	@Override
	public void pause(Song song) {
		song.setState(new PausarSong());
		
	}

	@Override
	public void stop(Song song) {
		System.out.println("Error: no hay song para hacer stop");
		
	}

}
