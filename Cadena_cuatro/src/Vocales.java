public class Vocales {

    private char[] vocales = {'a','e','i','o','u'};
    public Vocales() {
    }
    public int cantidad_vocales(String cadena)
    {
        int vocales= 0;

        cadena = cadena.toLowerCase();
        System.out.println(cadena.matches("([aeiou])"));
        return  vocales;
    }
}
