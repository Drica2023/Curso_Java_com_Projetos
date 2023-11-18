package edu.estudos.java;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double preco = scanner.nextDouble();

		// double preco = 34.5;
		double desconto = (preco < 20.0) ? (preco * 0.01) : (preco * 0.05);
		System.out.println(desconto);
		scanner.close();
	}

}
