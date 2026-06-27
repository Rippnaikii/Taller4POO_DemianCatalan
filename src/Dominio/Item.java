package Dominio;

import Logica.Visitor;

public class Item extends Carta {
	int bonificacion;
	
	public Item(String nombre, int rareza,int bonificacion) {
		super(nombre, rareza);
		this.bonificacion = bonificacion;
	}

	@Override
	public void aceptar(Visitor v) {
		int poder = v.calcularPoder(this);
		super.setPoder(poder);
	}

	public int getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}

}
