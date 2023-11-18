package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import utilitarias.Calculador;

public class Program {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		
			
		
		System.out.println("Entre com o Valor do Raio: ");
		double radius = scanner.nextDouble();
		
		double c = Calculador.circunferencia(radius);
		
		double v = Calculador.volume(radius);
		
		
		System.out.printf("Circunferencia: %.2f%n", c);
		
		System.out.printf("Volume: %.2f%n", v);
		
		System.out.printf("Valor do PI: %.4f%n", Calculador.PI );
		
		scanner.close();
		}
}
	
	
		
	

