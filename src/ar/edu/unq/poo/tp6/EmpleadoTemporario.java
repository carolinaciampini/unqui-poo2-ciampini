package ar.edu.unq.poo.tp6;

public class EmpleadoTemporario extends Empleado {

	private int horas;
	private boolean tieneHijos;
	private boolean estaCasado;
	
	public EmpleadoTemporario(int horas, boolean hijos, boolean casado) {
		this.tieneHijos = hijos;
		this.estaCasado = casado;
		this.horas = horas;
	}
	
	public double sueldoBasico() {
		return 1000; 
	}
	
	public double sueldoBruto() {
		double result = this.sueldoBasico() + (5 * horas); 
		if (tieneHijos || estaCasado) {
			result += 100; 
		}
		return result; 
	}
	 
	
}
