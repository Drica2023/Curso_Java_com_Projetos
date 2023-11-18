package edu.vetores.produtos;

import java.util.Locale;
import java.util.Scanner;

import edu.vetores.entidades.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com numero de posicoes do Vetor");
		int numero = scanner.nextInt();

		Produto[] vect = new Produto[numero];

		for (int i = 0; i < vect.length; i++) {
			scanner.nextLine(); // como foi dado um nextLine antes, uma linha ficou pendente, para consumir essa
								// linha é colocado o nextInt para pular essa linha
			System.out.println("Entre com o nome do produto: ");
			String name = scanner.nextLine();
			System.out.println("Entre com o preco do produto: ");
			double price = scanner.nextDouble();

			vect[i] = new Produto(name, price);

		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {

			soma += vect[i].getPreco();

		}

		double mediaPreco = soma / numero;
		System.out.printf("A media dos precos é: %.2f%n", mediaPreco);

		scanner.close();

	}

}
