package palavras;

public enum ArquivosPorCaracteres {
	SILABAS_4("4_caracteres.txt", 4),
	SILABAS_5("5_caracteres.txt", 5),
	SILABAS_6("6_caracteres.txt", 6),
	SILABAS_7("7_caracteres.txt", 7),
	SILABAS_8("8_caracteres.txt", 8),
	SILABAS_9("9_caracteres.txt", 9),
	SILABAS_10("10_caracteres.txt", 10),
	SILABAS_11("11_caracteres.txt", 11),
	SILABAS_12("12_caracteres.txt", 12);
	
	private String arquivo;
	private int caracteres;
	
	private ArquivosPorCaracteres(String arquivo, int caracteres) {
		this.arquivo = arquivo;
		this.caracteres = caracteres;
	}
	
	public String getArquivo() {
		return arquivo;
	}
	
	public int getCaracteres() {
		return caracteres;
	}
}
