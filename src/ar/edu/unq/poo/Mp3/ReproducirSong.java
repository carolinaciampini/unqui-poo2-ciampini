package ar.edu.unq.poo.Mp3;

public class ReproducirSong implements EstadoReproductor{

	@Override
	public void play(Song song) {
		System.out.println("Error");
		
	}

	@Override
	public void pause(Song song) {
		song.setState(new PausarSong());
		
	}

	@Override
	public void stop(Song song) {
		song.setState(new SeleccionarSong());
		
	}

}
