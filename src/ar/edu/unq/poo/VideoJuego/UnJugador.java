package ar.edu.unq.poo.VideoJuego;

public class UnJugador implements EstadoMaquina{

	@Override
	public void ingresarFichas(VideoJuego maquina) {
		maquina.setEstado(new DosJugadores()); 
		
	}

	@Override
	public void tocarBoton(VideoJuego maquina) {
		System.out.println("Juego comenzando para un jugador...");
	}

	@Override
	public void finalizarJuego() {
		// no hace nada 
		
	}

}
