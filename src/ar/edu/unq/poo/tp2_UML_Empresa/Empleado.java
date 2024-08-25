package ar.edu.unq.poo.tp2_UML_Empresa;

import java.util.Date;

public abstract class Empleado {
	private String nombre;
    private String direccion;
    private String estadoCivil;
    private Date fecNac;
    private int sueldoBasico;
    
    
    public Empleado(String nombre, String direccion, String estadoCivil, Date fecNac, int sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.fecNac = fecNac;
        this.sueldoBasico = sueldoBasico;
    }
    
    // metodos concretos
    public int getEdad(Date fecActual) {
    	return 0; // to do 
    }
    
    public String getNombre () {
    	return nombre;  
    }
    
    public String getDireccion() {
        return direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public int getSueldoBasico() {
        return sueldoBasico;
    }
    
 // Métodos abstractos que las subclases deben implementar
    public abstract int getSueldoNeto();    
    public abstract int getRetenciones();     
    public abstract int getSueldoBruto();
}

