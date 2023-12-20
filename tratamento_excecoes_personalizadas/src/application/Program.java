package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		// Solucao 2 (ruim): metodo retornando String
		

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = scanner.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(scanner.next());
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(scanner.next());
		
		if(!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check- out date must be after date Check-in");
		}else {
		
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);
			
			System.out.println("");
			
			System.out.print("Enter data to update the Reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(scanner.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(scanner.next());
			
			String error = reservation.updateDates(checkin, checkout);
			if (error != null) {
			
				System.out.println("Error in reservation: " + error);
				
			}
			else {
				System.out.println("Reservation: " + reservation);	
		}
		
		}
		scanner.close();
	}
}
