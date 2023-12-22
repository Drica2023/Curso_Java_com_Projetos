package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {

		// Solucao 3 boa (tratamento de excecao)

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Room number: ");
			int number = scanner.nextInt();

			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(scanner.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(scanner.next());

			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);

			System.out.println("");

			System.out.print("Enter data to update the Reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(scanner.next());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(scanner.next());
			
			reservation.updateDates(checkin, checkout);
			System.out.println("Reservation: " + reservation);

		} catch (ParseException e) {
			System.out.println("Invalid date format ");

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		scanner.close();
	}
}
