package app;

public class AppEjemploListaNombres {
	private EjemploListaNombres lista;

	public AppEjemploListaNombres() {
		this.lista = new EjemploListaNombres();
	}

	public void procesarLista() {
		lista.ingresarNombres();
		lista.imprimirlistaNombres();
		lista.actualizarDato();
		lista.imprimirlistaNombres();
		lista.borrarElemento();
		lista.imprimirlistaNombres();
	}

	public static void main(String[] args) {
		AppEjemploListaNombres app = new AppEjemploListaNombres();
		app.procesarLista();
	}

}