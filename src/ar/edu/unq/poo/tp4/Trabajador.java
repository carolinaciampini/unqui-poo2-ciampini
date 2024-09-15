package ar.edu.unq.poo.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresosAnuales;
	
	public Trabajador() {
		ingresosAnuales = new ArrayList<>(); 
	}
	
	public void addIngreso(Ingreso ingreso) {
		ingresosAnuales.add(ingreso);
	}
	
	public double getTotalPercibido() {
		double total = 0;
		
		for (Ingreso ingreso : ingresosAnuales) {
			total += ingreso.getMontoPercibido();
		}
		return total;
	}
	
	public double getTotalImponible() {
		double total = 0;
		
		for (Ingreso ingreso : ingresosAnuales) {
			total += ingreso.getMontoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getTotalImponible() * 0.02;
 	}
}
