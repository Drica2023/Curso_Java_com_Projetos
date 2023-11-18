package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Produtos produtos = new Produtos();
		

		System.out.println("Entre com os Dados:");
		System.out.println("Digite o nome do produto: ");
		produtos.nome = scanner.nextLine();
		System.out.print("Digite o preco: ");
		produtos.preco = scanner.nextDouble();
		System.out.print("Digite a Quantidade: ");
		produtos.quantidade = scanner.nextInt();
		
		//substituir pelo toString()
		/*System.out.println("O nome do produto é: " + produtos.nome + ", preço: " + produtos.preco + ",  Quantidade: " + produtos.quantidade);
		
		double TotalEstoque = produtos.totalValorEstoque();
		System.out.println(TotalEstoque);
		*/
		System.out.println(produtos.toString());
		
		
		System.out.println("Entre com a quantidade que deseja adicionar ao estoque: ");
		int qtd = scanner.nextInt();
		produtos.adicionarProdutos(qtd);
		
		System.out.println(produtos.toString());
		
		System.out.println("Entre com a quantidade que deseja adicionar ao estoque: ");
		qtd = scanner.nextInt();
		produtos.removerProdutos(qtd);
		
		System.out.println(produtos.toString());
				
		
		scanner.close();

	}

}
