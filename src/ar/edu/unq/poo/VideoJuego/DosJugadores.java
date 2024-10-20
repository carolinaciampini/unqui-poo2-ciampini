package ar.edu.unq.poo.VideoJuego;

public class DosJugadores implements EstadoMaquina {

	@Override
	public void ingresarFichas(VideoJuego maquina) {
		System.out.println("No hay mas modos");
		
	}
 
	@Override
	public void tocarBoton(VideoJuego maquina) {
		System.out.println("Juego comenzando para dos jugadores...");
	}

	@Override
	public void finalizarJuego() {
		// TODO Auto-generated method stub
		
	}

}
