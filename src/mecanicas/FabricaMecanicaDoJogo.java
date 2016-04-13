package mecanicas;

public class FabricaMecanicaDoJogo {
	public static MecanicaDoJogo getMecanicaDoJogo(Mecanicas mecanica){		
		if(mecanica == null) return null;
		switch (mecanica) {
		case FACIL:
			return new DificuldadeFacil();
		case MEDIO:
			return new DificuldadeMedio();
		case DIFICIL:
			return new DificuldadeDificil();
		default:
			return new MecanicaAleatoria();
		}
	}
}
