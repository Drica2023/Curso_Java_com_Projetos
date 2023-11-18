package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ContaBancaria contaBancaria;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o numero da conta: ");
		int numero = scanner.nextInt();
		System.out.println("Entre com o Titular da conta:");
		String titular = scanner.next();
		System.out.println("Exite deposito inicial a ser depositado (y/n)");
		char opcao = scanner.next().charAt(0);
		if (opcao == 'y') {
			System.out.println("Entre com o Valor do deposito inicial");
			double depositoInicial = scanner.nextDouble();
			contaBancaria = new ContaBancaria(numero, titular, depositoInicial);
		} else {

			contaBancaria = new ContaBancaria(numero, titular);
		}

		System.out.println();

		System.out.println(contaBancaria);
		
		System.out.println();

		System.out.println("Entre com o valor do Deposito");
		double valorDeposito = scanner.nextDouble();
		contaBancaria.deposito(valorDeposito);
		System.out.println("Saldo atualizado: " + contaBancaria);
		System.out.println();
		
		System.out.println("Digite o valor que deseja sacar: ");
		double valorSaque = scanner.nextDouble();
		contaBancaria.saque(valorSaque);
		System.out.println("Saldo atualizado: " + contaBancaria);
		
		
		scanner.close();

	}

}
