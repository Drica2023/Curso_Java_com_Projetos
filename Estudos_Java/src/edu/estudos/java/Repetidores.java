package edu.estudos.java;

public class Repetidores {

	public static void main(String[] args) {
		int mes = 4;
		String nome = "Helder";

		// if sem else
		if (mes == 4) {

			System.out.println(" O mês é 4");

		}

		// if com else
		if (nome.equals("Helder")) {
			System.out.println("Nome Correto");

		} else {
			System.out.println("Nome incorreto");

		}
		/////////////////////////////////////////
		int i = 1;
		while (i <= 20) {
			System.out.println(i);
			i++;

		}

		////// exemplificando o uso do comando while

		int y = 1;
		do {
			System.out.println(y);

			y++;

		} while (y != 21);

		// exemplificando o comando for
		// comando for e o uso do contador x

		for (int x = 1; x <= 20; x++) {

			System.out.print(x);

		}

	}

}
