package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Medeiros\\Documents\\MySql.txt");
		Scanner sc = null;
		try {
			sc = new Scanner (file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}catch (IOException e) {
			System.out.println("Erro no arquivo..." + e.getMessage());
		}finally {
			if(sc != null)
			sc.close();
		}
		
		
		
		
	}

}
