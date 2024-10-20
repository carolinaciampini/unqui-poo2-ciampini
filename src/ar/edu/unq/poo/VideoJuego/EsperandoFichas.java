package ar.edu.unq.poo.VideoJuego;

public class EsperandoFichas implements EstadoMaquina{


	@Override
	public void ingresarFichas(VideoJuego videoJuego) {
		videoJuego.setEstado(new UnJugador());
		
	}

	@Override
	public void tocarBoton(VideoJuego videoJuego) {
		System.out.println("Ingrese una o dos fichas segun el modo de juego.");
		
	}

	@Override
	public void finalizarJuego() {
		// TODO Auto-generated method stub
		
	}

}
