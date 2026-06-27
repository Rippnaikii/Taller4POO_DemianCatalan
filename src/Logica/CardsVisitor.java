package Logica;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public class CardsVisitor implements Visitor {

	@Override
	public int calcularPoder(Pokemon p) {
		return (p.getDaño()/p.getCantEnergy())*100;
		//podriamos hacer el calculo y setear el poder aca mismo
		/*
		 * poder = [calculos]
		 * p.setPoder(poder);  PERO NOSE SI ES MAS CORRECTO COMO ESTA O ASÍ 
		 * 
		 */
	}

	@Override
	public int calcularPoder(Item i) {
		return i.getBonificacion()*20;

	}

	@Override
	public int calcularPoder(Supporter s) {
		return s.getEfectoTurno()*50;

	}

	@Override
	public int calcularPoder(Energy e) {
		return 1;
	}

}
