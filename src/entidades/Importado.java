package entidades;

public class Importado extends Produto{
	private double taxaAlfandega;
	
	public Importado() {
		
	}

	public Importado(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	public double valorTotal() {
		return taxaAlfandega+preco;	
	}
	@Override
	public final String etiquetaPreco() {
		StringBuilder string = new StringBuilder();
		string.append(getNome()+" $");
		string.append(String.format("%.2f",valorTotal()));
		string.append(" (Taxa de Alfandega: $ "+taxaAlfandega+")");
		return string.toString();
	}
	
	

}
