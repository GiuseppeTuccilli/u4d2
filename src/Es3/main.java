package Es3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        String stringaSep = "";

        while (!stringa.equals(":q")) {
            System.out.println("inserire una stringa, inserire :q per terminare:");
            stringa = scanner.nextLine();
            for (int i = 0; i < stringa.length() - 1; i++) {
                stringaSep = stringaSep + stringa.charAt(i) + ",";
            }
            stringaSep = stringaSep + stringa.charAt(stringa.length() - 1);
            System.out.println(stringaSep);

        }

    }
}
