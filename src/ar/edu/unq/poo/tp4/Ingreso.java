package ar.edu.unq.poo.tp4;

public class Ingreso {
	private String mesPercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String mes, String concepto, double monto) {
		super();
		
		this.concepto = concepto;
		this.mesPercepcion = mes;
		this.montoPercibido = monto;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public  double getMontoImponible() {
		return montoPercibido; 
	}
}
