package codingame;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * La méthode computeMultiplesSum(n) doit renvoyer la somme de tous les
 * multiples positifs de 3 ou
 * 5 ou 7 strictement inférieurs à n .
 * Par exemple, pour n=11 , on obtient 3,5,6,7,9,10 en tant que multiples et la
 * somme de ces multiples
 * vaut 40.
 * Implémentez computeMultiplesSum(n) .
 * Contraintes:
 * 0 # n < 1000
 */
public class ComputeMultiplesSum {


    public static int computeMultiplesSum(int n) {
        int x3 = 0, x5 = 0, x7 = 0;
        int x15 = 0, x21 = 0, x35 = 0;
        int x105 = 0;

        for (int i = 3; i < n; i += 3)
            x3 += i;
        for (int i = 5; i < n; i += 5)
            x5 += i;
        for (int i = 7; i < n; i += 7)
            x7 += i;
        for (int i = 15; i < n; i += 15)
            x15 += i;
        for (int i = 21; i < n; i += 21)
            x21 += i;
        for (int i = 35; i < n; i += 35)
            x35 += i;
        for (int i = 105; i < n; i += 105)
            x105 += i;

        return x3 + x5 + x7 - x15 - x21 - x35 + x105;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int res = computeMultiplesSum(n);
        System.setOut(outStream);
        System.out.println(res);
    }
    // #endregion
    
}
