package mecanicas;

public interface MecanicaDoJogo {
	String regras();
	boolean acertou(String input);
	String getPalavraEmabaralhada();
	void resetaPontos();
	int getPontosTotais();
	int getPontos();
	int getTentativas();
	int getTentativasRemanescentes();
	int getCaracteresMin();
	int getCaracteresMax();
}
