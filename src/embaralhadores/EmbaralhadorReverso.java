package embaralhadores;

public class EmbaralhadorReverso implements Embaralhador{

	@Override
	public String getPalavraEmbaralhada(String palavra) {
		return new StringBuilder(palavra).reverse().toString();
	}

}
