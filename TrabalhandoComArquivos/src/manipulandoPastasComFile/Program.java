package manipulandoPastasComFile;

import java.io.File;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o local da pasta(path): ");
		String strpath = sc.nextLine();
		
		File path = new File(strpath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		// para criar uma subpasta 
		
		boolean sucess = new File(strpath + "\\subpasta1").mkdir();
		System.out.println("Criado a subpasta:  " + sucess);
		
		sc.close();		
	}

}
