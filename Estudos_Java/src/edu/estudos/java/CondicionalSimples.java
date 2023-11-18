package edu.estudos.java;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int minutos = scanner.nextInt();

		double conta = 50.0;

		if (minutos <= 100) {

			System.out.println("Valor da conta = " + conta);

		} else if (minutos > 100) {
			minutos = (minutos - 100);
			conta += (minutos * 2.0);
			System.out.printf("Valor da conta = " + conta);

		}

		scanner.close();
	}

}
