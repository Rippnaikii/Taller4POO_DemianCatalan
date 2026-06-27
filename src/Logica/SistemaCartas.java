package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SistemaCartas implements Sistema {
	private static SistemaCartas sistema = null;
	
	private SistemaCartas() {
		
	}
	
	public static SistemaCartas getInstance() {
		if (sistema == null) {
			sistema = new SistemaCartas();
		}
		return sistema;
	}
	
	@Override
	public void leerSobres() {
		try {
			File f = new File("Sobres.txt");
			Scanner sc = new Scanner(f);
			while (sc.hasNext()) {
				String linea = sc.nextLine().strip();
				//Implementamos factory
				FactoryCards.crearCartas(linea);
				
				
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
