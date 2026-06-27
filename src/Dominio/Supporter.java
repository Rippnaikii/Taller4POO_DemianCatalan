package Dominio;

import Logica.Visitor;

public class Supporter extends Carta {
	int efectoTurno;
	public Supporter(String nombre, int rareza,int efectoTurno) {
		super(nombre, rareza);
		this.efectoTurno = efectoTurno;
	}

	@Override
	public void aceptar(Visitor v) {
		v.calcularPoder(this);
		
	}

	public int getEfectoTurno() {
		return efectoTurno;
	}

	public void setEfectoTurno(int efectoTurno) {
		this.efectoTurno = efectoTurno;
	}
	

}
