package Es1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        String parola;
        int anno;
        System.out.println("inserire una stringa:");
        parola = scanner.nextLine();
        System.out.println(stringaPariDispari(parola) + " che la stringa è pari");
        System.out.println("inserire un anno:");
        anno = Integer.parseInt(scanner.nextLine());
        System.out.println(annoBisestile(anno) + " che l'anno è bisestile");

    }

    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile(int a) {
        if ((a % 4) == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}