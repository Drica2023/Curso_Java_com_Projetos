package Entidades;

public class Produtos {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	
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
		
		return nome 
				+ ", $ " 
				+ String.format("%.2f", preco)
				+ ", " 
				+ quantidade
				+ " unidades, Total $ "
				+ String.format("%.2f", totalValorEstoque());
				
				
	}
	
	
		
		
	
}
