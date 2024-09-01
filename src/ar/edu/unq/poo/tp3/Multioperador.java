package ar.edu.unq.poo.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List<Integer> numeros;
	
	// constructor
	public Multioperador() {
		this.numeros = new ArrayList<Integer>();	
	}
	
	 public int sumar() {
	        int result = 0;
	        for (int numero : numeros) {
	        	result += numero;
	        }
	        return result;
	 } 
	 
	 public int restar() {
	        if (numeros.isEmpty()) {
	            return 0;
	        }
	        
	        int resta = numeros.get(0); // agarro el primero para ir restando 
	        for (int i = 1; i < numeros.size(); i++) {
	            resta -= numeros.get(i);
	        }
	        return resta;
	  }
	 
	 public int multiplicar() {
	       if (numeros.isEmpty()) {
	            return 0;
	      }

	       int result = 1;
	       for (int numero : numeros) {
	            result *= numero;
	      }
	        return result;
	   }	
	
	    public void addNumber(int numero) {
	        numeros.add(numero);
	    }
	    
	    public List<Integer> getNumbers(){
	    	return numeros;
	    }

}
