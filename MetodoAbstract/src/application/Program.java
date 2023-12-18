package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List <Shape> list = new ArrayList<>();
	
		
		System.out.print("Enter the number of shape: ");
		int n = scanner.nextInt();
		
		for ( int i= 1; i <= n; i++) {
			System.out.println("Shape #:" + i + " data: ");
			System.out.print("Rectangle or Circle: (r /c)");
			char tipo = scanner.next().charAt(0);
			System.out.print(" Color Black / Blue / Red: " );
			Color color = Color.valueOf(scanner.next());
			
			if (tipo == 'r') {
				System.out.print("Width: ");	
				double width = scanner.nextDouble();
				System.out.print("Height: ");	
				double height = scanner.nextDouble();
				list.add(new Rectangle(color, width, height));
				
			}
			
			else if (tipo == 'c') {
				System.out.print("Radius:");	
				double radius = scanner.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println("");
		System.out.println("SHAPE AREAS");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f",shape.area()));
		}
		scanner.close();

	}

}
