package exercicioHeranca;

public class Ex01animal {
	private String nome;
	private int idade;
	
	public void emitirSom() {
		System.out.println("Emitindo som característico...");
	}

	/** @return the nome */
	public String getNome() {
		return nome;
	}

	/** @param nome the nome to set */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
