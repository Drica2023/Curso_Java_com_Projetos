package edu.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class ArrayListEx1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> cursos = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			cursos.add(scanner.nextLine());
			

		}
		
		cursos.remove(1);
		System.out.println(cursos);
		System.out.println(cursos.get(1));
		
		Collections.sort(cursos);
		System.out.println(cursos);
		
		scanner.close();

	}
}
