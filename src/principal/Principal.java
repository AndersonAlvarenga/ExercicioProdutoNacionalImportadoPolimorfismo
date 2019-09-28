
package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Importado;
import entidades.Produto;
import entidades.Usado;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		List<Produto> listaProduto = new ArrayList<Produto>();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Produto produto;
		System.out.print("Entre com o número de produtos: ");
		Scanner sc = new Scanner(System.in);
		int quantidadeProduto = sc.nextInt();
		for (int i = 0; i < quantidadeProduto; i++) {
			System.out.println("Produto #" + (i + 1));
			char tipoProduto;
			System.out.print("Nacional, Usado ou Importado (n,u,i)? ");
			tipoProduto = sc.next().charAt(0);
			if (tipoProduto == 'n') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Preço: ");
				double preco = sc.nextDouble();
				produto = new Produto(nome, preco);
				listaProduto.add(produto);
			} else {
				if (tipoProduto == 'i') {
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Preço: ");
					double preco = sc.nextDouble();
					System.out.print("Taxa de Alfandega: ");
					double valorTaxaAlfandega = sc.nextDouble();
					produto = new Importado(nome, preco, valorTaxaAlfandega);
					listaProduto.add(produto);

				} else {
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Preço: ");
					double preco = sc.nextDouble();
					System.out.print("Data de Fabricação: ");
					Date dataFabricacao = formato.parse(sc.next());
					produto = new Usado(nome, preco, dataFabricacao);
					listaProduto.add(produto);
				}

			}

		}
		for (Produto x : listaProduto) {
			System.out.println(x.etiquetaPreco());
		}

		sc.close();
	}

}
