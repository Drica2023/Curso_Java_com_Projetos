package Entidades;

public class Produtos {

	public String nome;
	public double preco;
	public int quantidade;

	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	// Sobrecarga - quando quer utilizar o mesmo nome de construtor mas com quantidade objetos diferentes
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		
	}

	public double totalValorEstoque() {

		double totalEstoque = preco * quantidade;
		return totalEstoque;

	}

	public void adicionarProdutos(int quantidade) {

		this.quantidade += quantidade;

	}

	public void removerProdutos(int quantidade) {

		this.quantidade -= quantidade;

	}

	public String toString() {

		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total $ "
				+ String.format("%.2f", totalValorEstoque());

	}
}
