package ar.edu.unq.poo.tp6;

public abstract class Empleado {
	
	public double sueldo() {
		return this.sueldoBruto() - this.aportesYObraSocial(); 
	}
	
	public abstract double sueldoBruto();
	public abstract double sueldoBasico();
	
	public double aportesYObraSocial() {
		return this.sueldoBruto() * 13 / 100 ; 
	}
	
}
