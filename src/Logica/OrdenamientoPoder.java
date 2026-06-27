package Logica;

import java.util.ArrayList;

import Dominio.Carta;

public class OrdenamientoPoder implements Strategy {

	@Override
	public void ordenarLista(ArrayList<Carta> list) {
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = 0; j < list.size()-i-1; j++) {
				if (list.get(j).getPoder()<list.get(j+1).getPoder()) {
					Carta aux = list.get(j);
					list.set(j, list.get(j +1));
                    list.set(j + 1, aux);
				}
				
			}
			
		}

	}

}
