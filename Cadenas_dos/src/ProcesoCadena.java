public class ProcesoCadena {

    public char obtenerCaracter(String cad1, int posicion)
    {
        char caracter = cad1.charAt(posicion);
        return caracter;
    }

    public String obtenerCompareTo(String cadena1, String cadena2)
    {
        int res = cadena1.compareTo(cadena2);
        String respuesta = "";
        if (res == 0)
        {
            respuesta = "Las cadena son iguales";

        }else if(res > 0)
        {
            respuesta = "La cadena mayor es "+ cadena1;
        }else
        {
            respuesta  = "La cadena mayor es "+ cadena2;
        }
        return respuesta;
    }

    public boolean obtenerComparacion(String cadena1, String cadena2)
    {
        if (cadena1.equals(cadena2))
        {
            return true;
        }else {
            return false;
        }

    }


}
