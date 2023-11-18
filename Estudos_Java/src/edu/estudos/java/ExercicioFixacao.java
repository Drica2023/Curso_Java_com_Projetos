package edu.estudos.java;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com três numeros");

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		if (n1 > n2 && n1 > n3) {

			System.out.println(n1);

		} else if (n2 > n1 && n2 > n3) {

			System.out.println(n2);

		} else
			System.out.println(n3);

		// funcao personalizada Max (encontra o maior valor)

		int higher = max(n1, n2, n3);
		showResult(higher);

		scanner.close();
	}

	public static int max(int n1, int n2, int n3) {
		int aux;
		if (n1 > n2 && n1 > n3) {

			aux = n1;

		} else if (n2 > n3) {

			aux = n2;

		} else {
			aux = n3;
		}
		return aux;
	}
	
	public static void showResult(int higher) {
		System.out.println(higher);
		
	}

}
