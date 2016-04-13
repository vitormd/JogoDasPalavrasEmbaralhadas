package embaralhadores;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEmbaralhadorDeMetadesProfundidade1 {
	
	private static final String PALAVRA = "umanova";
	private static final String PALAVRAEMBARALHADA = "novauma";
	
	@Test
	public void testeGetEmbaralhadorAleatorio() {
		EmbaralhadorDeMetadesProfundidade1 embaralhador = new EmbaralhadorDeMetadesProfundidade1();

		assertEquals(PALAVRAEMBARALHADA, embaralhador.getPalavraEmbaralhada(PALAVRA));
	}

}
