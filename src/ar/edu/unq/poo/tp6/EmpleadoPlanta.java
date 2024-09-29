package ar.edu.unq.poo.tp6;

public class EmpleadoPlanta {
	private int cantHijos;
	
	public EmpleadoPlanta(int hijos) {
		this.cantHijos = hijos;
		
	}
	
	public double sueldoBasico() {
		return 3000;
	}
	
	public double sueldoBruto() {
		return this.sueldoBasico() + (150 * cantHijos); 
	}
}
