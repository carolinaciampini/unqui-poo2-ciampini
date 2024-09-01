package ar.edu.unq.poo.tp2_UML_Empresa;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class EmpresaTest {
	 private Empresa empresa;
	 
	 @BeforeEach
	void setUp() throws Exception {
	        this.empresa = new Empresa("testEmpresa", 20);
	}
	
	 @Test
	void testCreacionEmpresa() {
		assertEquals("testEmpresa", empresa.getNombre());
		assertEquals(20, empresa.getCUIT());
		assertTrue(empresa.getEmpleados().isEmpty());
	}
	 
	@Test
	void testCrearEmpleado () {
		Empleado empleado = new EmpleadoPermanente("Caro", "1234", "S", LocalDate.of(2004, 10, 6), 50000, 2, 10); 
		empresa.agregarEmpleados(empleado);

		assertEquals(1, empresa.getEmpleados().size());
		
	}

}
