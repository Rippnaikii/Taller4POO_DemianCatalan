package Logica;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public interface Visitor {
	void calcularPoder(Pokemon p);
	void calcularPoder(Item i);
	void calcularPoder(Supporter s);
	void calcularPoder(Energy e);
}
