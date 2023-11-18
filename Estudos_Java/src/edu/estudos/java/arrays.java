package edu.estudos.java;

public class arrays {

	public static void main(String[] args) {
		double[] notas = new double[4];
		notas[0] = 2.6;
		notas[1] = 10.0;
		notas[2] = 9.5;
		notas[3] = 10.0;

		System.out.println("Exibindo notas");

		for (int i = 0; i < notas.length; i++) {

			System.out.println(notas[i]);

		}
	}

}
