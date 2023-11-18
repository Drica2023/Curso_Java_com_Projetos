package br.edu.aula;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2023-11-18");
		LocalDateTime d02 = LocalDateTime.parse("2023-11-18T12:01:20");
		Instant d03 = Instant.parse("2023-11-18T12:02:14Z");

		// formatar para texto a data e hora com o format
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		System.out.println("d01: " + d01.format(fmt1));
		// ou dessa formar tambem
		System.out.println("d01: " + fmt1.format(d01));
		System.out.println("d01: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("d02: " + fmt2.format(d02));
		System.out.println("d02: " + fmt4.format(d02));
		
		
		// converteu a hora global para a hora local 
		System.out.println("d03: " + fmt3.format(d03));
		System.out.println("d03: " + fmt5.format(d03));
	}

}
