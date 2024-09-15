package ar.edu.unq.poo.tp4;

public class ProductoPrimeraNecesidad {
	
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado; 
	
	
	public ProductoPrimeraNecesidad (String nombre, double precio, boolean esCuidado) {
		super();
		
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esCuidado  ;
	}
	
	// constructor si no me llegan a pasar el atributo de si es cuidado o no;
	public ProductoPrimeraNecesidad(String nombre, double precio) {
        this(nombre, precio, false); 
    }
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	
	
	public void aumentarPrecio(double cantidad) {
		this.precio += cantidad;
	}
}