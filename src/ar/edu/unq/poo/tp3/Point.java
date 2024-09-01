package ar.edu.unq.poo.tp3;

public class Point {
	private int x;
	private int y; 
	
	// Debe ser posible crearse indicando como referencia los valores x e y
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// debe ser posible crear un punto directamente sin enviarles parámetros, en este caso el punto
	 // debe crearse en las coordenadas (0,0).
	public Point() {
		this(0, 0);
	}
	
	// Debe ser posible mover un punto a otra posición.
	public void moveTo(int nuevaX, int nuevaY) {
		this.x = nuevaX;
		this.y = nuevaY;
	}
	
	//Sumarse con otro punto y como resultado obtener un nuevo punto con las valores de x e y sumados.
	public Point addPoint(Point punto) {
		return new Point(this.x + punto.x, this.y + punto.y);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}
