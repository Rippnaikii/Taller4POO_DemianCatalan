package Dominio;

import Logica.Visitor;

public class Pokemon extends Carta{
	private int daño,cantEnergy;
	
	public Pokemon(String nombre, int rareza,int daño,int cantEnergy) {
		super(nombre, rareza);
		this.cantEnergy = cantEnergy;
		this.daño = daño;
	}

	@Override
	public void aceptar(Visitor v) {
		v.calcularPoder(this);
		
	}

	public int getDaño() {
		return daño;
	}

	public int getCantEnergy() {
		return cantEnergy;
	}

}
