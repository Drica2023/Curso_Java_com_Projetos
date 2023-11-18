package edu.vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Entre com um numero de posicoes do Vetor/array");
		int numero = scanner.nextInt();
		double[] vect = new double[numero];
		
		for(int i = 0 ; i < numero; i++) {
			System.out.println("Entre com a altura: ");
			vect[i] = scanner.nextDouble();
		}
		
		double somaAlturas = 0.0;
		
		for(int i=0; i < vect.length; i++ ) {
			
			somaAlturas = (somaAlturas + vect[i]);
			 //mediaAltura += vect[i];  poderia ser assim tambem 
			 
			
		}
		 double mediaAltura = somaAlturas / numero;
		 System.out.printf("media das Alturas é:  %.2f%n", mediaAltura);
		
		scanner.close();
	}
		
}
