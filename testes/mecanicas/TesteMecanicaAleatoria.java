package mecanicas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteMecanicaAleatoria {

	@Test
	public void testeRegras() {
		MecanicaDeDificuldade dificuldade = new DificuldadeFacil();
		
		assertEquals(MecanicaUtils
				.regras(
					dificuldade.getCaracteresMin(),
					dificuldade.getCaracteresMax(),
					dificuldade.getTentativas(),
					dificuldade.getPontos()),
				dificuldade.regras());
	}
	
	@Test
	public void testeAcertou() {
		MecanicaDeDificuldade dificuldade = new DificuldadeDificil();
		
		dificuldade.getPalavraEmabaralhada();
		
		String palavra = dificuldade.getPalavra();
		
		dificuldade.acertou(palavra);
		dificuldade.acertou(palavra);
		
		assertEquals(dificuldade.getPontos() * 2, dificuldade.getPontosTotais());
	}
	
	@Test
	public void testeResetaPontos() {
		MecanicaDeDificuldade dificuldade = new DificuldadeFacil();
		
		dificuldade.getPalavraEmabaralhada();
		dificuldade.acertou(dificuldade.getPalavra());
		
		dificuldade.resetaPontos();
		
		assertEquals(0, dificuldade.getPontosTotais());
	}

}
