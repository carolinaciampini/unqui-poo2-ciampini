package ar.edu.unq.poo.Encriptacion;

public class EncriptadorNaive {
	private EstrategiaEncriptacion estrategia; // guarda strategy
	
	// constructor
	public EncriptadorNaive(EstrategiaEncriptacion estrategia) {
        this.estrategia = estrategia;
    }
	
	// cambia strategy el usuario en tiempos de ejecuciuon
	public void setEstrategia(EstrategiaEncriptacion estrategia) {
        this.estrategia = estrategia;
    }
	
	
    public String encriptar(String texto) {
        return estrategia.encriptar(texto);
    }

    
    public String desencriptar(String texto) {
        return estrategia.desencriptar(texto);
    }
}
