package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com os Dados:");
		System.out.println("Digite o nome do produto: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o preco: ");
		double preco = scanner.nextDouble();
		System.out.print("Digite a Quantidade: ");
		int quantidade = scanner.nextInt();

		Produtos produtos = new Produtos(nome, preco, quantidade);

		// substituir pelo toString()
		/*
		 * System.out.println("O nome do produto é: " + produtos.nome + ", preço: " +
		 * produtos.preco + ",  Quantidade: " + produtos.quantidade);
		 * 
		 * double TotalEstoque = produtos.totalValorEstoque();
		 * System.out.println(TotalEstoque);
		 */
		System.out.println(produtos.toString());

		System.out.println("Entre com a quantidade que deseja adicionar ao estoque: ");
		int qtd = scanner.nextInt();
		produtos.adicionarProdutos(qtd);

		System.out.println(produtos.toString());

		System.out.println("Entre com a quantidade que deseja adicionar ao estoque: ");
		qtd = scanner.nextInt();
		produtos.removerProdutos(qtd);

		
		//outra forma de chamar o metodo toString()
		produtos.toString();

		scanner.close();

	}

}
