package embaralhadores;

import java.util.Random;

public class FabricaEmbaralhadores {
	public static Embaralhador getEmbaralhadorAleatorio() {
		Random r = new Random();
		boolean caraOuCoroa = r.nextBoolean();
		return (caraOuCoroa ? new EmbaralhadorDeMetadesProfundidade1() : new EmbaralhadorReverso());
	}
}
