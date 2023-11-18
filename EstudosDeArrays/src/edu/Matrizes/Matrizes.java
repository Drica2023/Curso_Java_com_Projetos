package edu.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o numero");
		int n = scanner.nextInt();
		
		int [][] matrizes = new int[n][n];
		
		for (int i =0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrizes[i][j] = scanner.nextInt();
				
			}
		}
		
		for (int i =0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matrizes[i][j] + " ");
			
				
			}
		}
		
		System.out.println("");
		System.out.println("Diagonal Principal da matriz ");
		for (int i =0; i < n; i++) {
				System.out.print(matrizes[i][i] + " ");
				
				
			
		}
		
		int cont = 0;
		for (int i =0; i < matrizes.length; i++) {
			for(int j = 0; j < matrizes[i].length; j++) {
				if(matrizes[i][j] < 0) {
					cont++;
				}
				
			}
		}
		System.out.println("");
		System.out.println("Quantidade de numeros menores que zero = " + cont);
		
		scanner.close();
		
	}

}
