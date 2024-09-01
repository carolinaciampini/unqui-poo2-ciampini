package ar.edu.unq.poo.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {
	private Point point1; 
	private Point point2; 
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		point1 = new Point();
		point2 = new Point(2,4);
	
	}
	
	@Test
	public void testCreandoPointConValores() {

		assertEquals(2, point2.getX());
		assertEquals(4, point2.getY());
	}
	
	@Test
	public void testCreandoPointSinValores() {

		assertEquals(0, point1.getX());
		assertEquals(0, point1.getY());
	}
	
	@Test
	public void testMoverPoint() {
		 point1.moveTo(7, 8);
		 assertEquals(7, point1.getX());
	     assertEquals(8, point1.getY());
	}
	
	
	@Test
	public void testSumarPoints() {
		Point point3 = new Point(4,5);
		Point sumado = point2.addPoint(point3);
		
		assertEquals(6, sumado.getX());
	    assertEquals(9, sumado.getY());
		
	}
	
	
}
