package Entidades;

public class ContaBancaria {

	private int numero;
	private String titular;
	private double balance;

	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;

	}

	public ContaBancaria(int numero, String titular, double valorInicial) {

		this.numero = numero;
		this.titular = titular;
		deposito(valorInicial);
	}

	public int getNumero() {
		return numero;
	}

	public double getBalance() {
		return balance;

	}

	public String getTitular() {
		return titular;

	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void deposito(double dinheiro) {
		balance += dinheiro;

	}

	public void saque(double dinheiro) {
		balance -= dinheiro + 5.0;

	}


	public String toString() {
		return "ContaBancaria = "
				+ numero + ", titular = " 
				+ titular + ", balance: $ " 
				+ String.format("%.2f", balance);
	}

}
