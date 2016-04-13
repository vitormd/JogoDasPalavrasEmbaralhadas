package mecanicas;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.internal.matchers.InstanceOf;

public class TesteFabricaMecanicaDoJogo {

	@Test
	public void testeGetMecanicaDoJogo() {
		boolean[] expecteds = {true, true, true, true, true};
		boolean[] actuals = new boolean[5];
		
		actuals[0] = FabricaMecanicaDoJogo.getMecanicaDoJogo(Mecanicas.FACIL) instanceof DificuldadeFacil;
		actuals[1] = FabricaMecanicaDoJogo.getMecanicaDoJogo(Mecanicas.MEDIO) instanceof DificuldadeMedio;
		actuals[2] = FabricaMecanicaDoJogo.getMecanicaDoJogo(Mecanicas.DIFICIL) instanceof DificuldadeDificil;
		actuals[3] = FabricaMecanicaDoJogo.getMecanicaDoJogo(Mecanicas.ALEATORIA) instanceof MecanicaAleatoria;
		actuals[4] = FabricaMecanicaDoJogo.getMecanicaDoJogo(null) == null;
		
		assertArrayEquals(expecteds, actuals);
	}

}
