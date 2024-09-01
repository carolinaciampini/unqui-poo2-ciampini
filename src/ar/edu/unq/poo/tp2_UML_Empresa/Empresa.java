package ar.edu.unq.poo.tp2_UML_Empresa;

import java.util.HashSet;
import java.util.Set; // importo la interfaz LIST 

public class Empresa {
	private String nombre;
	private int CUIT;
	private Set <Empleado> empleados; 
		// recibe objetos del tipo Empleado
	
	// constructor - new()
	public Empresa (String nombre, int CUIT) {
		this.nombre = nombre;
		this.CUIT = CUIT; 
		this.empleados = new HashSet<>();
	}
	
	public void agregarEmpleados (Empleado emp) {
		empleados.add(emp);
// colaborador metodo  parametro
	}
	
	public Set<Empleado> getEmpleados(){
		return empleados; 
	}
	
	public int getTotalDeSueldosNetos() {
		return 0; // to DO 
	}
	
	public int getTotalDeSueldosBrutos() {
		return 0; // to DO 
	}
	
	public int getTotalDeRetenciones() {
		return 0; // to DO 
	}
	
	public String getNombre() {
		return nombre; 
	}
	
	public int getCUIT () {
		return CUIT;
	}
	
}
	
	
	