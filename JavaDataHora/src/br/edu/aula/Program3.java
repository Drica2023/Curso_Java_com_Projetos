package br.edu.aula;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {
		//obter dados de uma data-hora local
		
		LocalDate d01 = LocalDate.parse("2023-11-18");
		LocalDateTime d02 = LocalDateTime.parse("2023-11-18T13:11:14");
		Instant d03 = Instant.parse("2023-11-18T13:11:14Z");
		
		//todas as zonas disponivel para ser utilizadas
		//for(String Zonas : ZoneId.getAvailableZoneIds()) {
		//	System.out.println(Zonas);
		//}
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());	
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());	
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("Resultado 1: " + r1);	
		System.out.println("Resultado 1: " + r2);	
		System.out.println("Resultado 1: " + r3);	
		System.out.println("Resultado 1: " + r4);	
		
		System.out.println("obtendo o dia: " + d01.getDayOfMonth());
		System.out.println("obtendo o mes: " + d01.getMonthValue());
		System.out.println("obtendo dia da semana: " + d01.getDayOfWeek());
		System.out.println("obtendo quantos dias do ano: " + d01.getDayOfYear());
		System.out.println("Obtendo o ano:  " + d01.getYear());
		
		System.out.println("Obtendo o ano:  " + d02.getHour());

	
	}

}
