package Logica;

import Dominio.Carta;

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
			return null;
		case "item":
			int bonificacion = Integer.parseInt(partes[3]);
		case "supoorter":
			int efectoTurno = Integer.parseInt(partes[3]);
		case "energy":
			String elemento = partes[3];
			
		default:
			break;
		}
		return null;
	}
}
