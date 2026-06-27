package Dominio;

import Logica.Visitor;

public class Energy extends Carta {
	private String elemento;
	public Energy(String nombre, int rareza,String elemento) {
		super(nombre, rareza);
		this.elemento = elemento;
	}

	@Override
	public void aceptar(Visitor v) {
		v.calcularPoder(this);
		
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

}
