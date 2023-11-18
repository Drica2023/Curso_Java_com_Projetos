package edu.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantas pessoas serão inseridas: ");

		int numeroPessoas;
		numeroPessoas = scanner.nextInt();
		String[] nomes = new String[numeroPessoas];
		int[] idade = new int[numeroPessoas];
		double[] altura = new double[numeroPessoas];

		for (int i = 0; i < numeroPessoas; i++) {

			System.out.println("Entre os Dados da " + (i + 1) + "a Pessoa");

			nomes[i] = scanner.next();
			idade[i] = scanner.nextInt();
			altura[i] = scanner.nextDouble();

		}
		double soma = 0.0;

		for (int i = 0; i < numeroPessoas; i++) {
			System.out.println("------------------------");

			System.out.println("Nome: " + nomes[i]);
			System.out.println("Idade: " + idade[i]);
			System.out.println("Altura: " + altura[i]);

			soma = soma + altura[i];

		}

		double mediaAltura = soma / numeroPessoas;
		System.out.println("------------------------");
		System.out.printf("Media das Alturas: %.2f%n ", mediaAltura);
		System.out.println("------------------------");

		int cont = 0;
		for (int i = 0; i < numeroPessoas; i++) {
			if (idade[i] < 16) {
				cont = cont + 1;

			}

		}
		double somaIdade = (cont * 100.0) / numeroPessoas;

		System.out.printf("Percentual de pessoas com menos de 16 anos:  %.1f%%%n", somaIdade);
		
		for (int i = 0; i <numeroPessoas; i++) {
			if(idade[i] < 16) {
				
				System.out.println(nomes[i]);
				
			}
			
		scanner.close();

	}

}
}
