package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Dominio.Carta;

public class SistemaCartas implements Sistema {
	private static SistemaCartas sistema = null;
	ArrayList<Carta> listCartas;
	
	private SistemaCartas() {
		this.listCartas = new ArrayList<Carta>();
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
				Carta nuevaCarta = FactoryCards.crearCartas(linea);
				listCartas.add(nuevaCarta);
				
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
