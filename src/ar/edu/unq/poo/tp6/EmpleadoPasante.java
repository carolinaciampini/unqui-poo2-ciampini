package ar.edu.unq.poo.tp6;

public class EmpleadoPasante extends Empleado {
	private int horas;
	
	public EmpleadoPasante(int horas) {
		this.horas = horas;
	}
	
	public double sueldoBasico() {
		return 40 * horas; 
	}
	
	public double sueldoBruto() {
		return this.sueldoBasico(); 
	}
}
