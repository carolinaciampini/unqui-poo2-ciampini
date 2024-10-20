package ar.edu.unq.poo.Mp3;

public class Song {
	private EstadoReproductor state;
	
	public Song() {
		this.state = new SeleccionarSong();
	}

	public void setState(EstadoReproductor estado) {
		this.state = estado;
		
	}
}
 