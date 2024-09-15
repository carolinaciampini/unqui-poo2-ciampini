package ar.edu.unq.poo.tp4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest {

    @Test
    public void testGetTotalPercibido() {
        Trabajador trabajador = new Trabajador();
        trabajador.addIngreso(new Ingreso("Enero", "Salario", 1000));
        trabajador.addIngreso(new IngresoPorHorasExtra("Febrero", "Horas Extras", 200, 10));

        assertEquals(1200, trabajador.getTotalPercibido());
    }

    @Test
    public void testGetMontoImponible() {
        Trabajador trabajador = new Trabajador();
        trabajador.addIngreso(new Ingreso("Enero", "Salario", 1000));
        trabajador.addIngreso(new IngresoPorHorasExtra("Febrero", "Horas Extras", 200, 10));

        assertEquals(1000, trabajador.getTotalImponible());  // el monto del ingresoPorHorasExtra no es imponible
    }

    @Test
    public void testGetImpuestoAPagar() {
        Trabajador trabajador = new Trabajador();
        trabajador.addIngreso(new Ingreso("Enero", "Salario", 1000));
        trabajador.addIngreso(new IngresoPorHorasExtra("Febrero", "Horas Extras", 200, 10));

        assertEquals(20, trabajador.getImpuestoAPagar());  // 2% de 1000
    }
}
