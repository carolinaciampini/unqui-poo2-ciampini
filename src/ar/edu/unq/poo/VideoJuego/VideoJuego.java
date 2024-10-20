package ar.edu.unq.poo.VideoJuego;

public class VideoJuego {
	public EstadoMaquina state;
	
	public VideoJuego() {
        this.state = new EsperandoFichas(); // Estado inicial
        
    }
	
	public void setEstado(EstadoMaquina estado) {
        this.state = estado;
    }
	
	public void insertarFicha() {
        state.ingresarFichas(this);
    }

    public void tocarBoton() {
        state.tocarBoton(this);
    }

    public void finalizarJuego() {
        state.finalizarJuego();
    }
   
}
