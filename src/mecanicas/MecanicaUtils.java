package mecanicas;

import palavras.BancoDePalavras;

public class MecanicaUtils {

	public static String regras(int caracteresMin, int caracteresMax, int tentativas, int pontos) {
		return String.format("Você tem %d tentativas para acertar a palavra."
				+ "\nA palavra tem entre %d e %d caracteres."
				+ "\nValendo %d pontos!",
				tentativas, caracteresMin, caracteresMax, pontos);
	}

	public static boolean acertou(String palavra, String input) {
		return input.compareToIgnoreCase(palavra) == 0;
	}
	
	public static String getNovaPalavra(int caracteresMin, int caracteresMax) {
		return BancoDePalavras.getNovaPalavra(caracteresMin, caracteresMax);
	}
}
