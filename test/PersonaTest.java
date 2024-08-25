import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	private Persona carolina;
	
	@BeforeEach
	void setUp() throws Exception {
		this.carolina = new Persona("Carolina");
	}
	
	@Test
	void testConstructor() {
		assertEquals("Carolina", this.carolina.getNombre());
		assertEquals(0, this.carolina.getCantPerros());
		
	}

}
