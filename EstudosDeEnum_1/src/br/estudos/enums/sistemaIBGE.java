package br.estudos.enums;

public class sistemaIBGE {

	public static void main(String[] args) {

		EstadoCivil e = EstadoCivil.SOLTEIRO;
		System.out.println(e);
		
		System.out.println("");
		System.out.println("Lista do Enum Estado Civil");

		
		
		for(EstadoCivil estado: EstadoCivil.values()) {
			System.out.println(estado);
		}

	}

}
