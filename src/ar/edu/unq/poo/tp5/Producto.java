package ar.edu.unq.poo.tp5;

public class Producto {
	private String nombre; 
	private double precioBase; 
	private int stock; 
	private boolean esCooperativa;
	
	public Producto(double precio, boolean esCooperativa, String nom) {
		super();
		this.precioBase = precio;
		this.stock = 1; 
		this.esCooperativa = esCooperativa;
		this.nombre = nom;
	}
	
	
	public void agregarStock() {
		stock += 1;
	}
	
	public void disminuirStock() {
		if (stock > 0) {
			stock -= 1; 
		}
	}
	
	public double getPrecio() {
		if (esCooperativa) {
			return precioBase * 0.9;
		}else {
			return precioBase;
		}
	}
	
	public int getStock() {
		return stock;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
}
