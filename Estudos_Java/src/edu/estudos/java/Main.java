package edu.estudos.java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.print("Ola mundo!");
		System.out.println("Bom dia!");
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(y);
		System.out.println(x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("resultado = " + x + " metros%n");
		System.out.printf("resultado = %.2f metros%n", x);
		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}