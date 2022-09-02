package app;

import java.util.ArrayList;
import java.util.List;

public class EjemploListaNombres {
	private List<String> listaNombres;

	public EjemploListaNombres() {
		this.listaNombres = new ArrayList<>();
	}

	public void ingresarNombres() {
		System.out.println("\nANEXAR DATOS");
		listaNombres.add("Leidy Gómez");
		listaNombres.add("Edwin Zuluaga");
		listaNombres.add("Julio Casanova");
		listaNombres.add("Daniel Narváez");
		listaNombres.add("Carolina Muelle");
	}

	public void imprimirlistaNombres() {
		for (String lst : listaNombres) {
			System.out.println(lst);
		}
	}

	public void borrarElemento() {
		System.out.println("\nBORRAR DATOS");
		listaNombres.remove(3);
	}

	public void actualizarDato() {
		System.out.println("\nACTUALIZAR DATOS");
		listaNombres.set(2, "Fermín León");
	}
}