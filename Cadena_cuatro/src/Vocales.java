public class Vocales {

    private String vocales = "aeiou";
    public Vocales() {
    }
    public int cantidad_vocales(String cadena)
    {
        int nvocales= 0;

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char l = cadena.charAt(i);
            boolean isVocal = vocales.contains(Character.toString(l));
            nvocales  += isVocal ? 1:0;
        }

        return  nvocales;
    }
}
