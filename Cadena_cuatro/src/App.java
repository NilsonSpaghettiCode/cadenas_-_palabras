public class App {

    public static void main(String[] args) {
        String cadena = "aaaaa";
        Vocales vocales = new Vocales();
        int cantidad_vocales = vocales.cantidad_vocales(cadena);
        System.out.println("Cantidad de vocales de "+cadena+ " es: "+ cantidad_vocales);
    }
}
