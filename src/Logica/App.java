package Logica;

import Dominio.Carta;

public class App {

	public static void main(String[] args) {
		System.out.println("Sistema Cartas TCG");
		
		SistemaCartas sis = SistemaCartas.getInstance();
		sis.leerSobres();
		
		System.out.println("\n--- COLECCIÓN ACTUAL ---");
        for (Carta c : sis.getListCartas()) {
            System.out.println("Nombre: " + c.getNombre() + 
                               " | Rareza: " + c.getRareza() + 
                               " | Poder Calculado: " + c.getPoder());
        }
		
	}

}
