package edu.estudos.java;

import java.util.Locale;
import java.util.Scanner;

public class RepetidorDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		char resp;
		do {

			double c = scanner.nextInt();
			double F = 0;
			System.out.printf("Digite a Temperatura em Celsius: ");
			F = ((9.0 * c) / 5.0) + 32;
			System.out.println("Temperatuda em Fahrenheit é: " + F);
			System.out.println("Deseja repetir (s / n)? ");

			resp = scanner.next().charAt(0);

		} while (resp != 'n');
		scanner.close();
	}

}
