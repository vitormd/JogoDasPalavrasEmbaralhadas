package mecanicas;

import java.util.Random;

import embaralhadores.Embaralhador;
import embaralhadores.FabricaEmbaralhadores;

public class MecanicaAleatoria implements MecanicaDoJogo {
	private static final int CARACTERES_MIN = 4;
	private static final int CARACTERES_MAX = 12;
	private String palavra;
	private int pontos;
	private int tentativas;
	private int tentativasRemanescentes;
	private int pontosTotais;

	public MecanicaAleatoria() {
		this.pontosTotais = 0;
	}
	
	@Override
	public String regras() {
		Random r = new Random();
		tentativas = r.nextInt(4) + 1;
		tentativasRemanescentes = tentativas;
		pontos = 50 / tentativas;
		
		return MecanicaUtils.regras(CARACTERES_MIN, CARACTERES_MAX, tentativas, pontos);
	}

	@Override
	public boolean acertou(String input) {
		tentativasRemanescentes--;
		boolean acertou = MecanicaUtils.acertou(palavra, input);
		if(acertou) {
			pontosTotais += pontos;
		}
		return acertou;
	}
	
	@Override
	public void resetaPontos() {
		pontosTotais = 0;
	}
	
	@Override
	public String getPalavraEmabaralhada() {
		palavra = MecanicaUtils.getNovaPalavra(CARACTERES_MIN, CARACTERES_MAX);
		
		Embaralhador embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
		
		return embaralhador.getPalavraEmbaralhada(palavra);
	}

	@Override
	public int getPontosTotais() {
		return pontosTotais;
	}
	
	@Override
	public int getPontos() {
		return pontos;
	}
	
	@Override
	public int getTentativas() {
		return tentativas;
	}

	@Override
	public int getTentativasRemanescentes() {
		return tentativasRemanescentes;
	}

	@Override
	public int getCaracteresMin() {
		return CARACTERES_MIN;
	}

	@Override
	public int getCaracteresMax() {
		return CARACTERES_MAX;
	}
}
