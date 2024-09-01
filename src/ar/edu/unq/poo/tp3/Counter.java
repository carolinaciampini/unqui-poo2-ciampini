package ar.edu.unq.poo.tp3;

import java.util.ArrayList;

import java.util.List;

public class Counter {
	private List<Integer> arrayElementos;
	
	
	// constructor
	public Counter () {
		this.arrayElementos = new ArrayList<Integer>();
	}
	
	
	public void addNumber(int num) {
		arrayElementos.add(num);
	};
	
	public int getCantidadDePares() {
		int contador = 0;
		for (Integer elem :  arrayElementos ) {
			if (elem % 2 == 0) {
				contador++;
			}
		}
		return contador;

    };
    
    public int getCantidadDeImpares() {
    	int contador = 0;
		for (Integer elem :  arrayElementos ) {
			if (elem % 2 != 0) {
				contador++;
			}
		}
		return contador;
    };
    
    //  La cantidad de múltiplos de un cierto número.
    

	
}
