package mecanicas;

import embaralhadores.Embaralhador;
import embaralhadores.FabricaEmbaralhadores;

public abstract class MecanicaDeDificuldade implements MecanicaDoJogo {
	private int caracteresMin;
	private int caracteresMax;
	private String palavra;
	private int pontos;
	private int tentativas;
	private int tentativasRemanescentes;
	private int pontosTotais;

	public MecanicaDeDificuldade(int caracteres_min, int caracteres_max, int pontos, int tentativas) {
		this.caracteresMin = caracteres_min;
		this.caracteresMax = caracteres_max;
		this.pontos = pontos;
		this.tentativas = tentativas;
		this.tentativasRemanescentes = tentativas;
		this.pontosTotais = 0;
	}
	
	@Override
	public String regras() {
		tentativasRemanescentes = tentativas;
		return MecanicaUtils.regras(caracteresMin, caracteresMax, tentativas, pontos);
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
	public String getPalavraEmabaralhada() {
		palavra = MecanicaUtils.getNovaPalavra(caracteresMin, caracteresMax);
				
		Embaralhador embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
		
		return embaralhador.getPalavraEmbaralhada(palavra);
	}
	
	@Override
	public void resetaPontos() {
		pontosTotais = 0;
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

	public int getCaracteresMin() {
		return caracteresMin;
	}

	public int getCaracteresMax() {
		return caracteresMax;
	}
	
	public String getPalavra() {
		return palavra;
	}
}
