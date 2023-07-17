package applicazione;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import applicazione.servizi.DaTestare;
import applicazione.servizi.ServizioTerzo;

@SpringBootTest
class Boot08ApplicationTests {
	
	@Autowired
	DaTestare classe;
	
	@MockBean
//	@Autowired
	ServizioTerzo terzo;
	
	@BeforeEach
	public void setUp() {
		Mockito.when(terzo.metodo())
			.thenReturn("ok");
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testaUnMetodo() {
		var risultato = classe.daTestare();
		assertEquals("ok", risultato);
	}
	
	@Test
	void testaServizioTerzo() {
		var risultato = terzo.metodo();
		assertEquals("ok", risultato);
	}
	
}
