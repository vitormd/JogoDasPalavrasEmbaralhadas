package embaralhadores;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEmbaralhadorReverso {

	private static final String PALAVRA = "umanova";
	private static final String PALAVRAEMBARALHADA = "avonamu";
	
	@Test
	public void testeGetEmbaralhadorAleatorio() {
		EmbaralhadorReverso embaralhador = new EmbaralhadorReverso();
		
		assertEquals(PALAVRAEMBARALHADA, embaralhador.getPalavraEmbaralhada(PALAVRA));
	}

}
