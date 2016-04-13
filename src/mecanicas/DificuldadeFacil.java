package mecanicas;

class DificuldadeFacil extends MecanicaDeDificuldade implements MecanicaDoJogo {

	private static final int CARACTERES_MIN = 4;
	private static final int CARACTERES_MAX = 6;
	private static final int PONTOS = 10;
	private static final int TENTATIVAS = 3;
	
	public DificuldadeFacil() {
		super(CARACTERES_MIN, CARACTERES_MAX, PONTOS, TENTATIVAS);
	}
}
