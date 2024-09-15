package ar.edu.unq.poo.tp4;

public class IngresoPorHorasExtra extends Ingreso {
	
	private int horasExtra;
	
	
	public IngresoPorHorasExtra(String mes, String concepto, double montoPercibido, int horas) {
		super(mes, concepto, montoPercibido);
		this.horasExtra = horas;
	}

	public  double getMontoImponible() {
		return 0;
	}
}
