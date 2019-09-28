package entidades;


public class Produto {
	private String nome;
	protected double preco;

	public Produto() {
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String etiquetaPreco() {
		StringBuilder string = new StringBuilder();
		string.append(getNome()+" $");
		string.append(String.format("%.2f",getPreco()));
		return string.toString();
	}
}
