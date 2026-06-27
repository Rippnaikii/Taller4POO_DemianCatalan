package Dominio;

import Logica.Visitable;

public abstract class Carta implements Visitable{
	private String nombre;
	private int rareza;
	//Atributo Poder 
	private int poder;
	public Carta(String nombre, int rareza) {
		this.nombre = nombre;
		this.rareza = rareza;
		this.poder = 0; // Poder parte en 0 para poder calcularlo y luego .set
	}
	
	
	
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {  //Lo modificamos con el Visitor
		this.poder = poder;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRareza() {
		return rareza;
	}
	public void setRareza(int rareza) {
		this.rareza = rareza;
	}
	
	
	
	
}
