package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Method1();
		System.out.println("End of Program");
	}
	
	public static void Method1() {
		Method2();
	}

	public static void Method2() {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);

		try {
			String[] vect = scanner.nextLine().split(" ");
			int position = scanner.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		scanner.close();
	}
}
