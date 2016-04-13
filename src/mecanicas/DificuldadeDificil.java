package mecanicas;

class DificuldadeDificil extends MecanicaDeDificuldade {

	private static final int CARACTERES_MIN = 10;
	private static final int CARACTERES_MAX = 12;
	private static final int PONTOS = 40;
	private static final int TENTATIVAS = 1;
	
	public DificuldadeDificil() {
		super(CARACTERES_MIN, CARACTERES_MAX, PONTOS, TENTATIVAS);
	}
}
