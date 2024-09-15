package ar.edu.unq.poo.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto prod) {
		productos.add(prod);
	}

	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto prod : productos) {
			precioTotal += prod.getPrecio();
		};
		
		return precioTotal;
		
	}
	
}