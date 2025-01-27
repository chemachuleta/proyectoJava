package E901CasasColgadas;

import java.util.Scanner;

public class E901CasasColgadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();
        for (int i = 1; i <= num; i++) {
            String palabra = teclado.next().toLowerCase();
            System.out.println(ComprobarPalabras(palabra));
        }
    }

    public static String ComprobarPalabras(String palabra) {
        return palabra.equals("colgadas") ? "Bien" : "Mal";
    }
}
