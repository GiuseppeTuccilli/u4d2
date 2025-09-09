package Es2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserire un numero intero compreso tra 1 e 3");
        int numero = Integer.parseInt(scanner.nextLine());
        stampaIntero(numero);

    }

    public static void stampaIntero(int n) {
        switch (n) {
            case 3:
                System.out.println("tre");
                break;
            case 2:
                System.out.println("due");
                break;


            case 1:
                System.out.println("uno");
                break;
            default:
                System.out.println("numero non valido!");
        }
    }


}
