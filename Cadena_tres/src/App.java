public class App {
    public static void main(String[] args) {
        String cadena1 = "Computador";
        String cadena2 = "Datos";

        System.out.println(cadena1);
        System.out.println(cadena2);

        StringInvertida a = new StringInvertida();

        System.out.println(a.invertir(cadena1));
        System.out.println(a.invertir(cadena2));


    }
}
