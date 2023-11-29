package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com o Departamento");
		String departmentName = scanner.nextLine();
		System.out.println("Entre com dados do trabalhador: ");
		System.out.println("Nome: ");
		String workerNome = scanner.nextLine();
		System.out.println("Level");
		String workerLevel = scanner.nextLine();
		System.out.println("Base Salary");
		double baseSalary= scanner.nextDouble();
		
		Worker worker = new Worker(workerNome,WorkerLevel.valueOf(workerLevel),baseSalary, new Departament(departmentName) );			
			
		System.out.println("Quantos contratos o trabalhador tem ??");	
		int n = scanner.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			System.out.println("Entre com o Contrato #" + i + "data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scanner.next());
			System.out.print("Entre com o valor por Hora: ");
			double valuePerHour = scanner.nextDouble();
			System.out.print("Duration (Hour): ");
			int hours = scanner.nextInt();
			
			HourContract contract = new HourContract (contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
		
			
		}
		
		
		System.out.println();
		System.out.println("Entre com o ano e mes para calculo: (MM/YYYY)");
		String monthAndYear = scanner.next();
		int month = Integer.parseInt( monthAndYear.substring(0, 2));
		int year = Integer.parseInt( monthAndYear.substring(3));
		System.out.println("Nome:" + worker.getName());
		System.out.println("Departamento:" + worker.getDepartament().getName());
		System.out.println("Income for" + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		scanner.close();
	}


}
