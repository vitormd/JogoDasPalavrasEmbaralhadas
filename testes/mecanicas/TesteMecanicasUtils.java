package mecanicas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteMecanicasUtils {

	@Test
	public void testeRegras() {
		int caracteresMin = 1;
		int caracteresMax = 2;
		int tentativas = 10;
		int pontos = 100;
		String expected = String.format(
				"Você tem %d tentativas para acertar a palavra."
				+ "\nA palavra tem entre %d e %d caracteres."
				+ "\nValendo %d pontos!",
				tentativas, caracteresMin, caracteresMax, pontos);
		
		String actual = MecanicaUtils.regras(caracteresMin, caracteresMax, tentativas, pontos);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testeAcertou() {
		assertTrue(MecanicaUtils.acertou("OiiOioI", "oIioiOI"));
	}
	
	@Test
	public void testeGetNovaPalavra() {
		assertTrue(MecanicaUtils.getNovaPalavra(7, 7).length() == 7);
	}

}
