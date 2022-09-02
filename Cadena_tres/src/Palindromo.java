public class Palindromo {

    private String cadena;

    public Palindromo(String cadena) {
        this.cadena = cadena;
    }

    public Palindromo() {
    }


    public boolean esPalindromo()
    {
        this.cadena.toLowerCase();
        boolean palindromo = false;
        StringInvertida invertidor = new StringInvertida();
        invertidor.invertir(cadena);

        palindromo = cadena.equals(invertidor.invertir(cadena)) ? true:false;

        return palindromo;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}
