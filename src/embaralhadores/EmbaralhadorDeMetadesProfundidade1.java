package embaralhadores;

public class EmbaralhadorDeMetadesProfundidade1 implements Embaralhador {

	@Override
	public String getPalavraEmbaralhada(String palavra) {
		
		String metadeEsquerda = palavra.substring(0, palavra.length()/2);
		String metadeDireita = palavra.substring(palavra.length()/2, palavra.length());
		
		return metadeDireita + metadeEsquerda;
	}
}
