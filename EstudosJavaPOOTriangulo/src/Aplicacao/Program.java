package Aplicacao;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com os valores do triangulo de X:");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();
		
		System.out.println("Entre com os valores do triangulo de Y:");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			
			System.out.println("Larger area: X");
			
			
		}else {
			System.out.println("Larger area: Y");
			
			
		scanner.close();	
		}
	}

}
