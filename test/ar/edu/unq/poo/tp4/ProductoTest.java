package ar.edu.unq.poo.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.4, true);
		vino = new Producto("Vino", 55);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.4, arroz.getPrecio());
		assertTrue(arroz.esPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals( 55.0, vino.getPrecio());
		assertFalse(vino.esPrecioCuidado());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(19.9, arroz.getPrecio());
	}
}