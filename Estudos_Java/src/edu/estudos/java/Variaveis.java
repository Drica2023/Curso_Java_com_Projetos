package edu.estudos.java;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		int soma = a + b;
		String nome;

		// mensagem via terminal e nao salta linha
		System.out.print("a soma foi: " + soma);
		// mensagem via terminal e salta linha
		System.out.println("a soma foi: " + soma);

		// Exibir uma mensagem
		System.out.println("Hello, World");

		// Entrada de dado e saida desse dado
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.print("Digite um numero: ");
		a = sc.nextInt();
		System.out.println("Seu nome é: " + nome);
		System.out.print("Numero digitado é: " + a);
		sc.close();

	}

}
