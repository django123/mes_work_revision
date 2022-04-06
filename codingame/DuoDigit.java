package codingame;

import java.io.PrintStream;
import java.util.Scanner;


/**
 * On appelle "duodigit" un nombre entier dont la représentation décimale
 * n'utilise pas plus de deux
 * chiffres différents. Par exemple 12 , 110 , -33333 sont des duodigits, mais
 * 102 ne l'est pas.
 * Implémentez la méthode isDuoDigit(number) qui renvoie un string:
 * y si number est un duodigt n dans le cas contraire
 */
public class DuoDigit {
    
    public static String isDuoDigit(int number) {

        boolean isDuoDigit = Integer.toString(number).replace("-", "").chars().distinct().count() <= 2;
        return isDuoDigit ? "y" : "n";

    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        String result = isDuoDigit(number);
        System.setOut(outStream);
        System.out.println(result);
    }
}
