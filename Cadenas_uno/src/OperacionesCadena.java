
public class OperacionesCadena {

    private String cadena;

    public OperacionesCadena()
    {
        this.cadena = "";
    }

    public OperacionesCadena(String cadena)
    {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int obtenerLongitudCadena()
    {
        return  cadena.length();
    }

    public String convertirMayusculas(){
        return  cadena.toUpperCase();
    }

    public String convertirMinusculas()
    {
        return  cadena.toLowerCase();
    }

    public void imprimirCaracteres()
    {
        char c = ' ';
        System.out.println("\nImpresion de la Cadena por careacteres");
        for (int i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);
            System.out.println(i+" "+ c);
        }
        System.out.println(" ");

    }

}
