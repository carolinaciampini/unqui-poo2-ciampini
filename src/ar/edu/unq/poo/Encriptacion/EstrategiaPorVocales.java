package ar.edu.unq.poo.Encriptacion;

public class EstrategiaPorVocales  implements EstrategiaEncriptacion{

	@Override
    public String encriptar(String texto) {
        return texto.replaceAll("a", "e")
                    .replaceAll("e", "i")
                    .replaceAll("i", "o")
                    .replaceAll("o", "u")
                    .replaceAll("u", "a");
    }

    @Override
    public String desencriptar(String texto) {
        return texto.replaceAll("e", "a")
                    .replaceAll("i", "e")
                    .replaceAll("o", "i")
                    .replaceAll("u", "o")
                    .replaceAll("a", "u");
    }

}
