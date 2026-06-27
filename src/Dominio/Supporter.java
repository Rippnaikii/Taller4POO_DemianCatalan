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
		int poder = v.calcularPoder(this);
		super.setPoder(poder);
	}

	public int getEfectoTurno() {
		return efectoTurno;
	}

	public void setEfectoTurno(int efectoTurno) {
		this.efectoTurno = efectoTurno;
	}
	

}
