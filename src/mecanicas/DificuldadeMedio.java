package mecanicas;

class DificuldadeMedio extends MecanicaDeDificuldade {
	
	private static final int CARACTERES_MIN = 7;
	private static final int CARACTERES_MAX = 9;
	private static final int PONTOS = 15;
	private static final int TENTATIVAS = 2;
	
	public DificuldadeMedio() {
		super(CARACTERES_MIN, CARACTERES_MAX, PONTOS, TENTATIVAS);
	}
}
