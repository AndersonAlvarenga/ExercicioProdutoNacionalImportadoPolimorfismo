package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usado extends Produto {
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataDeFrabricacao;

	public Usado() {

	}

	public Usado(String nome, double preco, Date dataDeFrabricacao) {
		super(nome, preco);
		this.dataDeFrabricacao = dataDeFrabricacao;
	}

	public Date getDataDeFrabricacao() {
		return dataDeFrabricacao;
	}

	public void setDataDeFrabricacao(Date dataDeFrabricacao) {
		this.dataDeFrabricacao = dataDeFrabricacao;
	}

	@Override
	public final String etiquetaPreco() {
		StringBuilder string = new StringBuilder();
		string.append(getNome() +" (USADO)"+ " $");
		string.append(String.format("%.2f", getPreco()));
		string.append(" (Data de Fabricação: "+formato.format(dataDeFrabricacao)+")");
		return string.toString();
	}
}
