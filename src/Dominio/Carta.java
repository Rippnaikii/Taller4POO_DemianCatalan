package Dominio;

import Logica.Visitable;

public abstract class Carta implements Visitable{
	private String nombre;
	private int rareza;
	
	public Carta(String nombre, int rareza) {
		this.nombre = nombre;
		this.rareza = rareza;
	}
	
	
	
}
