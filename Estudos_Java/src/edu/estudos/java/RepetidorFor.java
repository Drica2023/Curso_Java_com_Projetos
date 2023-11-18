package edu.estudos.java;

public class RepetidorFor {
// for contagem progressiva
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i :" + i);

		}

// for contagem regressiva
		for (int i = 4; i > 0; i--) {
			System.out.println("Valor de i: " + i);

		}
		
		
		int x=3;
		int y=0;
		
		for( int i =0; i< x; i++) {
			System.out.print(i + " , " );
			y = y+5;
			System.out.println(y);
			
		}
		
	}

}
