package edu.vetores;

import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] numeroNegativos = new int[n];

		for (int i = 0; i < n; i++) {

			numeroNegativos[i] = scanner.nextInt();

		}
		System.out.println("Numeros negativos: ");
		for (int i = 0; i < n; i++) {
			if (numeroNegativos[i] < 0) {
				System.out.println(numeroNegativos[i]);

			}

		}

		scanner.close();
	}
}
