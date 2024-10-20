package ar.edu.unq.poo.Mp3;

public interface EstadoReproductor {
	void play(Song song);
    void pause(Song song);
    void stop(Song song);
}
