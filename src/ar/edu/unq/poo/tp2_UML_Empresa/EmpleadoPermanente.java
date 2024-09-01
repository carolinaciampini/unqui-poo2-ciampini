package ar.edu.unq.poo.tp2_UML_Empresa;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fecNac, int sueldoBasico, int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fecNac, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad 	= antiguedad; 
	}
	
	public int getCantidadDeHijos() {
		return cantidadHijos; 
	}
	
	
	
}
