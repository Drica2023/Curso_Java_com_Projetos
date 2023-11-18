package edu.estudos.java;

import java.util.Scanner;

public class RepetidorWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int soma = 0;

		while (x != 0) {
			soma += x; // expressao acumulativa
			x = sc.nextInt();

		}
		System.out.println(soma);
		sc.close();

	}

}
