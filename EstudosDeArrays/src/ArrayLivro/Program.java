package ArrayLivro;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {

	public static void main(String[] args) {

		int[] diversos = new int[5];

		diversos[0] = 10;
		diversos[1] = 20;
		diversos[2] = 30;
		diversos[3] = 40;
		diversos[4] = 50;

		System.out.println(diversos[2]);

		int numeroposicao = diversos[1];
		System.out.println(numeroposicao);

		ArrayList<String> diverso = new ArrayList<>();

		diverso.add("adriana");
		diverso.add("Heloisa");
		diverso.add("Aline");
		diverso.add("Noeme");
		
		System.out.println(diverso.get(1));
		
		HashMap<String, Integer> nomes = new HashMap<>();
		nomes.put("Adriana", 45);
		nomes.put("Noeme", 76);
		
		System.out.println(nomes.get("Adriana"));
		
		for (String nome: diverso) {
			System.out.println(nome);
			
			 {
				
		}

	}

}
}
