package codingame;


public class Palindrome {

    public static void main(String args[]) {

        int[] nombres = { 0, 2, 113, 11, 1443, 1441, 1654, 19891 };

        for (int nombre : nombres) {
            System.out.println(nombre + " est un palindrome? "+ estPalindrome(nombre));
        }
    }

    public static boolean pal(String mot) {
        int i = 0, longueur = mot.length() - 1;
        boolean egale = true;
        /*
         * tester le premier caractère avec le dernier
         * et s'ils sont égaux, le programme continu
         * à dérouler la boucle while et tester
         * le caractère suivant(i+1 avec longeur-(i+1))
         * jusqu'à i soit égale à longueur/2,
         * , sinon le booléen egale reçoit false
         * donc, la fonction pal retourne false
         */
        while (i < longueur / 2 && egale) {
            if (mot.charAt(i) == mot.charAt(longueur - i))
                egale = true;
            else
                egale = false;
            i++;
        }
        return egale;
    }


    /**
     * 
     * @param nombre
     * @return
     */

    private static boolean estPalindrome(int nombre) {
        if (nombre == inverse(nombre)) {
            return true;
        }
        return false;
    }

    private static int inverse(int nombre) {
        int inverse = 0;
        while (nombre != 0) {
            inverse = inverse * 10 + nombre % 10;
            nombre = nombre / 10;
        }
        return inverse;
    }
}
