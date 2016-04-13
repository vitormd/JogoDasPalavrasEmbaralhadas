package palavras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class BancoDePalavras {
	
	private static final String FOLDER_PATH = "src/palavras";
	
	public static String getNovaPalavra(int caracteresMin, int caracteresMax) {
		Random r = new Random();
		int caracteres = r.nextInt(caracteresMax - caracteresMin + 1) + caracteresMin;
		String palavra = null;
		
		for(ArquivosPorCaracteres arquivo : ArquivosPorCaracteres.values()) {
			if(arquivo.getCaracteres() == caracteres) {
				palavra = pegaPalavraNoArquivo(arquivo.getArquivo(), r.nextInt(7));
			}
		}
		return palavra;
	}
	
	private static String pegaPalavraNoArquivo(String arquivo, int indice) {
	    Stream<String> lines = null;
		try {
			lines = Files.lines(Paths.get(FOLDER_PATH, arquivo));
		} catch (IOException e) {
			return null;
		}

		String palavras = lines.toArray()[indice].toString();
	    lines.close();
	    
	    return palavras;
	}
}
