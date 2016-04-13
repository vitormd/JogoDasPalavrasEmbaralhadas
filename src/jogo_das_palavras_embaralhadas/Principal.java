package jogo_das_palavras_embaralhadas;

import java.util.Scanner;

import mecanicas.FabricaMecanicaDoJogo;
import mecanicas.MecanicaDoJogo;
import mecanicas.Mecanicas;

public class Principal {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		output("Jogo das Palavras Embaralhadas");
		
		MecanicaDoJogo mecanicaAtual = escolhaDificuldade();
		
		do {
			String palavra = mecanicaAtual.getPalavraEmabaralhada();
			
			output(mecanicaAtual.regras());
			output(String.format("A palavra embaralhada é:/n - %s -", palavra));
			
			boolean acertou = false;
			while(mecanicaAtual.getTentativas() > 0 && !acertou){
				String tentativa = input();
				acertou = mecanicaAtual.acertou(tentativa);
				
				if(acertou) {
					output(String.format("Parabéns, vocë ganhou %d pontos!", mecanicaAtual.getPontos()));
					output(String.format("Sua pontuação: %d", mecanicaAtual.getPontosTotais()));
			
				} else if(mecanicaAtual.getTentativasRemanescentes() == 0) {
					output("Você não conseguiu acertar! :'(");
					output(String.format("Você fez %d pontos!", mecanicaAtual.getPontosTotais()));
					mecanicaAtual.resetaPontos();
					break;
				} else {
					output("Não foi desta vez!");
					output(String.format("Você ainda possui %d tentativas!", mecanicaAtual.getTentativasRemanescentes()));
					output(String.format("A palavra embaralhada é:\n - %s -", palavra));
				}
			}
		} while(!pararDeJogar());
		output("Obrigado por jogar!");
	}
	
	private static String input() {
		return in.nextLine();
	}
	
	private static void output(String output) {
		System.out.println(output);
	}
	
	private static MecanicaDoJogo escolhaDificuldade() {
		while(true) {
			output("Escolha a dificuldade:");
			for(Mecanicas m : Mecanicas.values()) {
				output(String.format("%s - %s", m.getInput(), m.getName()));
			}
			try {
				String input = input();
				
				Mecanicas dificuldadeEscolhida = getDificuldade(input);
				
				MecanicaDoJogo mecanicaDoJogo = FabricaMecanicaDoJogo.getMecanicaDoJogo(dificuldadeEscolhida);
				
				if(mecanicaDoJogo == null) continue;
				
				return FabricaMecanicaDoJogo.getMecanicaDoJogo(dificuldadeEscolhida);
			} catch(RuntimeException e) {
				output(e.getMessage());
			}
		}
	}
	
	private static Mecanicas getDificuldade(String input) throws RuntimeException{
		for(Mecanicas mecanica : Mecanicas.values()) {
			if(mecanica.getInput().compareToIgnoreCase(input) == 0) return mecanica;
		}
		
		throw new RuntimeException("Dificuldade Inválida");
	}
	
	private static boolean pararDeJogar() {
		while(true){
			output("Parar de jogar? (y/N)");
			String input = input();
			if(input.compareToIgnoreCase("y") == 0 ||
			   input.compareToIgnoreCase("yes") == 0) 
				return true;
			
			else if(input.compareToIgnoreCase("n") == 0 ||
					input.compareToIgnoreCase("no") == 0 ||
					input.isEmpty()) 
				return false;
		}
	}
}
