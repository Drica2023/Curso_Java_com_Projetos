package edu.estudos.java;

public class OperacaoSplit {

	public static void main(String[] args) {

		String nomeCompleto = "adriana medeiros rodrigues";
		String[] vect = nomeCompleto.split(" ");

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
