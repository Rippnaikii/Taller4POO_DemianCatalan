package Logica;

import Dominio.Carta;
import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public class FactoryCards {
	public static Carta crearCartas(String linea) {
		String[] partes = linea.split(";");
		String nomCarta = partes[0];
		int rarezaC = Integer.parseInt(partes[1]);
		String tipoCarta = partes[2];
		
		switch (tipoCarta.toLowerCase()) {
		case "pokemon":
			int daño = Integer.parseInt(partes[3]);
			int cantEnergy = Integer.parseInt(partes[4]);
			return new Pokemon(tipoCarta, rarezaC, daño, cantEnergy);
		case "item":
			int bonificacion = Integer.parseInt(partes[3]);
			return new Item(tipoCarta, rarezaC, bonificacion);
		case "supporter":
			int efectoTurno = Integer.parseInt(partes[3]);
			return new Supporter(tipoCarta, rarezaC, efectoTurno);
		case "energy":
			String elemento = partes[3];
			return new Energy(tipoCarta, rarezaC, elemento);
			
		default:
			System.out.println("Tipo de carta no valido..");
			return null;
		}
		
	}
}
