package Logica;

import java.util.ArrayList;

import Dominio.Carta;

public class App {

	public static void main(String[] args) {
		System.out.println("Sistema Cartas TCG");
		
		SistemaCartas sis = SistemaCartas.getInstance();
		sis.leerSobres();
		
		System.out.println("\n--- COLECCIÓN ACTUAL ---");
        for (Carta c : sis.getListCartas()) {  // para ir probando como vamos
            System.out.println("Nombre: " + c.getNombre() + 
                               " | Rareza: " + c.getRareza() + 
                               " | Poder Calculado: " + c.getPoder());
        }
        
    
        Strategy estrategia = new OrdenamientoNombre();
        ArrayList<Carta> miColeccion = sis.getListCartas();

        estrategia.ordenarLista(miColeccion);   //Probando ahora el strategy 

        System.out.println("\n--- COLECCIÓN ORDENADA POR PODER (Mayor a Menor) ---");
        for (Carta c : sis.getListCartas()) {
            System.out.println("Nombre: " + c.getNombre() + 
                               " | Rareza: " + c.getRareza() + 
                               " | Poder: " + c.getPoder());
        }
		
	}

}
