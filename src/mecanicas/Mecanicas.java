package mecanicas;

public enum Mecanicas {	
	FACIL("Fácil", "F"),
	MEDIO("Médio", "M"),
	DIFICIL("Difícil", "D"),
	ALEATORIA("Aleatória", "A");
	
	private String name;
	private String input;
	
	private Mecanicas(String name, String input) {
		this.name = name;
		this.input = input;
	}

	public String getName() {
		return name;
	}

	public String getInput() {
		return input;
	}
}
