public class App2 {

    public static void main(String[] args) {

        String cadena1 = "oso";
        String cadena2 = "oro";
        String cadena3 = "1111";

        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena3);

        Palindromo palindromo = new Palindromo();

        palindromo.setCadena(cadena1);
        System.out.println("La palabra "+ cadena1 +" se lee igual que al reves: "+palindromo.esPalindromo());

        palindromo.setCadena(cadena2);
        System.out.println("La palabra "+ cadena2 +" se lee igual que al reves: "+palindromo.esPalindromo());

        palindromo.setCadena(cadena3);
        System.out.println("La palabra "+ cadena3 +" se lee igual que al reves: "+palindromo.esPalindromo());


    }
}
