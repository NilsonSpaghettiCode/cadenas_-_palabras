public class StringInvertida {

    private String cadena;

    public StringInvertida(String cadena) {
        this.cadena = cadena;
    }
    public StringInvertida(){}

    public String invertir(String cadena)
    {
        char[] cadena_array = cadena.toCharArray();

        char aux = ' ';
        int c = 0;
        //System.out.println(cadena_array.length/2);
        for (int i = cadena_array.length-1; i >= (cadena_array.length/2); i--) {
            aux = cadena_array[c];
            cadena_array[c] = cadena_array[i];
            cadena_array[i] = aux;
            //System.out.println( new String(cadena_array,0, cadena_array.length));
            c++;

        }

        return new String(cadena_array,0, cadena_array.length);

    }
}
