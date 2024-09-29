package ar.edu.unq.poo.tp5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	private List<Producto> productos;
	
	public Mercado() {
		super();
		this.productos = new ArrayList<Producto>(); 
	}
	
	
	public void agregarProducto(Producto prod) {
		if (productos.contains(prod)) {
			prod.agregarStock();
		} else {
			productos.add(prod);
		}
	}
	
	
	
}
