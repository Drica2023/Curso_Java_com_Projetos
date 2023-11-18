package edu.estudos.java;

public class EstudoForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {" adriana", "heloisa", "Manuela"}; 
		
		for(String nomes : vect) {
			System.out.println(nomes);
			
			
		}
		
		int[] numeros = new int[] {1, 5, 7, 4, 2, -4 };
		for(int number : numeros) {
			System.out.println(number);
			
		}

	}

}
