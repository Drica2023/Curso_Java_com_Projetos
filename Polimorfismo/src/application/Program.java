package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees:");
		int numero = scanner.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y /n) ?");
			char outsourced = scanner.next().charAt(0);

			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			

			System.out.print("Hours: ");
			int hours = scanner.nextInt();

			System.out.print("Value per hour: ");
			Double valuePerHour = scanner.nextDouble();

			if (outsourced == 'y') {

				System.out.print("Additional Change: ");
				Double additionalChange = scanner.nextDouble();

				Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalChange);
				list.add(emp);
			} else {
				// Employee emp = new Employee(name, hours, valuePerHour);
				list.add (new Employee(name, hours, valuePerHour));
			}

		}

		System.out.println();
		System.out.println("Payments:");
		for (Employee emp : list) {
			System.out.println( emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}

		scanner.close();
	}
}
