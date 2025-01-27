package P902Anillamiento764;

import java.util.Scanner;

public class P902Anillamiento764 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        do {
            int s = 0;
            if (n == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                int x = teclado.nextInt();
                int y = teclado.nextInt();
                s = s + x - y;
            }
            System.out.println(s);
            n = teclado.nextInt();
        }while (n != 0);


    }
}
