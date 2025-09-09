package Es4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserire un numero intero (maggiore di 0)");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero <= 0) {
            System.out.println("numero non valido!");
        } else {
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }


    }
}
