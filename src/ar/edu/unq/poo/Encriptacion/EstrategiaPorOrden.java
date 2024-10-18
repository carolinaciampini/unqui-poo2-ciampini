package ar.edu.unq.poo.Encriptacion;

public class EstrategiaPorOrden implements EstrategiaEncriptacion {

	@Override
	public String encriptar(String texto) {
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]).append(" ");
        }
        return resultado.toString().trim();
    }
	
	@Override
	public String desencriptar(String texto) {
		return this.encriptar(texto);
	}
	
}
