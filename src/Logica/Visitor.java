package Logica;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public interface Visitor {
	int calcularPoder(Pokemon p);
	int calcularPoder(Item i);
	int calcularPoder(Supporter s);
	int calcularPoder(Energy e);
}
