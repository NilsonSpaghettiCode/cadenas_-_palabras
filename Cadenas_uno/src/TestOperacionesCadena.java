import  java.util.Scanner;

public class TestOperacionesCadena {
    private final OperacionesCadena unaCadena;
    public TestOperacionesCadena() {
        this.unaCadena = new OperacionesCadena();
    }

    public void leerCadena(String cadena)
    {
        unaCadena.setCadena(cadena);
        System.out.println("\nLa Longitud de la cadena: "+ unaCadena.obtenerLongitudCadena()+ " caracteres ");
        System.out.println("\nLa cadena de texto en mayusculas: "+ unaCadena.convertirMayusculas());
        System.out.println("\nLa cadena de texto en minusculas: "+ unaCadena.convertirMinusculas());

    }

    public static void main(String[] args) {
        TestOperacionesCadena prueba = new TestOperacionesCadena();
        String cadena = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cadena");
        cadena = sc.nextLine();
        prueba.leerCadena(cadena);
    }
}
