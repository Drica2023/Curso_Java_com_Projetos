package br.edu.aula;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2023-11-18");
		LocalDateTime d02 = LocalDateTime.parse("2023-11-18T13:45:14");
		Instant d03 = Instant.parse("2023-11-18T13:45:14Z");

		LocalDate diasAnterioresLocalDate = d01.minusDays(7);
		LocalDate anosAfrente = d01.plusYears(4);

		System.out.println("Semana passada foi dia: " + diasAnterioresLocalDate);
		System.out.println("4 anos a Frente: " + anosAfrente);
		System.out.println("4 anos a Frente: " + anosAfrente.getDayOfWeek());

		LocalDateTime horaAnterioresLocalDateTime = d02.minusHours(3);
		LocalDateTime minutosAnterioresLocalDateTime = d02.plusMinutes(15);

		System.out.println("Diminuindo 3 horas: " + horaAnterioresLocalDateTime);
		System.out.println("Aumentando 15 minutos: " + minutosAnterioresLocalDateTime);

		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

		System.out.println("Diminuindo 7 dias: " + pastWeekInstant);
		System.out.println("Aumentando 7 dias: " + nextWeekInstant);

		// calcular a duração -> utilizando o Duration

		Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
		System.out.println(t1.toDays());

		Duration t2 = Duration.between(diasAnterioresLocalDate.atStartOfDay(), LocalDate.now().atStartOfDay());
		System.out.println(t2.toDays());

		Duration t3 = Duration.between(pastWeekInstant, d03);
		System.out.println(t3.toDays());
		
		Duration t4 = Duration.between(minutosAnterioresLocalDateTime, d02);
		System.out.println(t4.toMinutes());

	}

}
