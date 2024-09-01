package ar.edu.unq.poo.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class CounterTest {
	private Counter counter;

	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		}
	
	
		@Test
		public void testEvenNumbers() {
	
			assertEquals(1, counter.getCantidadDePares());
		}
		
		@Test
		public void testOddNumbers() {
	
			assertEquals(9, counter.getCantidadDeImpares());
		}
		
		
}
