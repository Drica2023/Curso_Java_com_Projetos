package br.edu.aula;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// Data local
		LocalDate d01 = LocalDate.now();
		System.out.println("d01: " + d01);

		// Data Hora local
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02: " + d02);

		// Data Hora Global
		Instant d03 = Instant.now();
		System.out.println("d03: " + d03);

		// passando um texto no formato ISO8601 e gera uma data hora apartir dele
		LocalDate d04 = LocalDate.parse("2023-11-18");
		System.out.println("d04: " + d04);

		LocalDateTime d05 = LocalDateTime.parse("2023-11-18T11:12:22");
		System.out.println("d05: " + d05);

		Instant d06 = Instant.parse("2023-11-18T11:24:25Z");
		System.out.println("d06: " + d06);

		// hora local e transformando para hora global
		Instant d07 = Instant.parse("2023-11-18T11:24:25-03:00");
		System.out.println("d07: " + d07);

		// especificar um formatado customizado -> utilizando um DateTimeFormatter
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d08 = LocalDate.parse("18/11/2023", fmt1);
		System.out.println("d08: " + d08);

		LocalDateTime d09 = LocalDateTime.parse("18/11/2023 11:39", fmt2);
		System.out.println("d09: " + d09);
		LocalDateTime d10 = LocalDateTime.parse("18/11/2023 11:39", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println("d10: " + d10);

		// passando dados isolados

		LocalDate d11 = LocalDate.of(2023, 11, 18);
		System.out.println("d11: " + d11);

		LocalDateTime d12 = LocalDateTime.of(2023, 11, 18, 11, 49);
		System.out.println("d12: " + d12);
		
		
		
		

	}

}
