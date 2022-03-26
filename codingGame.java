import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Algorithm.findLargest(int[] numbers) should return the largest number from
 * numbers. The array numbers
 * always contains at least one number.
 * Implement Algorithm.findLargest(int[] numbers).
 */

public class Algorithm {

    static int largestNumber(int[] numbers) {
        Arrays.sort(numbers); // return numbers[numbers.length -1];
        int max1 = Arrays.stream(numbers).m ax().getAsInt();
        if (numbers.length > 1) {
            int max = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                    if (max == Integer.MAX_VALUE) {
                        return max;
                    }
                }
            }
            return max;
        } else {
            return numbers[0];
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 100, 50, 150 };
        System.out.println(LargestNumber.findLargest(numbers));
    }
}

/**
 * 
 * Vous devez organiser un tournoi d'échecs dans lequel les joueurs
 * s'affronteront en duel.
 * Voici comment nous procédons pour former les duels : sélectionnez un premier
 * joueur au hasard, puis, sélectionnez son adversaire au
 * au hasard parmi les participants restants. La paire de concurrents obtenue
 * forme l'un des duels du
 * le tournoi. Nous procédons de la même manière pour former toutes les autres
 * paires.
 * Dans cet exercice, nous voudrions savoir combien de paires il est possible de
 * former sachant que l'ordre des adversaires dans une paire n'a pas
 * d'importance.
 * des adversaires dans une paire n'a pas d'importance.
 * Par exemple, avec 4 joueurs nommés A, B, C et D, il est possible d'obtenir 6
 * paires différentes : AB, AC, AD, BC,
 * BD, CD.
 * Implémentez count pour retourner le nombre de paires possibles. Le paramètre
 * n correspond au nombre de
 * joueurs.
 * Essayez d'optimiser votre solution de manière à ce que, idéalement, la durée
 * du traitement soit la même pour tout n.
 * Input: 2 <= n <= 10000
 */

class Solution {

    static int count(int n) {
        if (2 <= n || n >= 1000) {
            return n * (n - 1) / 2;
        }
        return 0;
    }
}

/**
 * Implémentez closestToZero pour retourner l'entier du tableau ints qui est le
 * plus proche de zéro.
 * Si deux entiers sont également proches de zéro, l'élément positif est
 * considéré comme le plus proche de zéro.
 * (exemple : si ints contient -5 et 5, il renvoie 5). Si ints est nul ou vide,
 * retournez 0.
 * Entrée : les entiers dans ints ont des valeurs allant de -2147483647 à
 * 2147483647.
 */

class ClosestToZero {

    /** @return the number that is closest to zero */
    static int closestToZero(int[] ints) {
        // Utiliser Math.Abs()
        if (ints == null || ints.length == 0) {
            return 0;
        }
        int closestToZero = ints[0];
        for (int i = 1; i < ints.length; i++) {
            int abs = Math.abs(ints[i]);
            if (abs < Math.abs(closestToZero)) {
                closestToZero = ints[i];
            } else if (abs == Math.abs(closestToZero) && closestToZero < 0 && ints[i] > 0) {
                closestToZero = abs;
            }
        }
        return closestToZero;
    }

    public static void main(String[] args) {
        /*
         * System.out.println(closestToZero(new int[]{7,5,9,1,4}));
         * System.out.println(closestToZero(new int[]{-273}));
         * System.out.println(closestToZero(new int[]{5526}));
         * System.out.println(closestToZero(new int[]{-15, -7, -9, -14, -12}));
         */
        System.out.println(closestToZero(new int[] { -10, -10 }));
        /*
         * System.out.println(closestToZero(new int[]{}));
         * System.out.println(closestToZero(new int[]{15, -7, 9 ,14, 7 ,12}));
         */
    }

}

public class Palindrome {

    public static void main(String args[]) {

        int[] nombres = { 0, 2, 113, 11, 1443, 1441, 1654, 19891 };

        for (int nombre : nombres) {
            System.out.println(nombre + " est un palindrome? "
                    + estPalindrome(nombre));
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
     * C'est bientôt les soldes d'été !
     * Vous travaillez pour un magasin qui souhaite offrir une réduction de
     * discount% sur le produit le plus
     * cher acheté par un client donné pendant la période des soldes.Un seul produit
     * peut bénéficier de la
     * réduction.
     * Le responsable du magasin vous demande de développer la méthode
     * calculateTotalPrice .
     * Cette méthode :
     * prend en paramètres la liste de prix des produits achetés par le client et le
     * pourcentage de réduction
     * discount . retourne le prix de vente total (arrondi à l'entier inférieur si
     * le total ne tombe pas rond).
     * Contraintes:
     * 0 ≤ discount ≤ 100 0 < prix d'un produit < 100000 0 < nombre de produits <100
     * 
     * @param prices
     * @param discount
     * @return
     */

    public static int calculateTotalPrice(int[] prices, int discount) {

        int total1 = 0;
        int len = prices.length;
        Arrays.sort(prices);
        for (int i = 0; i < len - 1; i++) {
            total1 = total1 + prices[i];
        }
        return (int) Math.floor(total1 + (((float) prices[len - 1]) - (prices[len - 1]) * discount / 100f));
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

class A {

    /**
     * Executes the service with the given connection.
     */
    void a(Service s, Connection c)throws Exception {
        // update this code
        try {
            s.setConnection(c);
            s.execute();
            c.commit(); // si ok on commit
        } catch (Exception e) {
            c.rollback(); //si echec on rollback
        }finally{
            c.close(); // dans tous les cas on applelle close
        }

    }

    interface Service {
        void execute() throws Exception;

        void setConnection(Connection c);
    }

    interface Connection {
        void commit();

        void rollback();

        void close();
    }
}

/**
 * On appelle "duodigit" un nombre entier dont la représentation décimale
 * n'utilise pas plus de deux
 * chiffres différents. Par exemple 12 , 110 , -33333 sont des duodigits, mais
 * 102 ne l'est pas.
 * Implémentez la méthode isDuoDigit(number) qui renvoie un string:
 * y si number est un duodigt n dans le cas contraire
 */

class Solution {

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
    // #endregion
}

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

class Solution {

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
//implement the method check(String str) to
// check the correctness of string of this type.check return true if the string is correct, false otherwise
class A {

    /**
     * Checks that the given string is​​​​​​‌​​‌‌​​​‌‌​‌‌‌‌​‌​‌‌​‌​​‌ correct.
     */
	static boolean check(String str) {

        if (null == str || str.isEmpty()) {
        return true;
    }
    // System.out.print(str + " -> ");
    Deque<Character> stack = new ArrayDeque();
    
    for (char c : str.toCharArray()) {
        if (c == ']' || c == ')') {
            if (stack.isEmpty()) {
                return false;
            }
            char prev = stack.pop();
            if (prev != '[' && c == ']' || prev != '(' && c == ')') {
                return false;
            }
        } else if (c == '[' || c == '(') {
            stack.push(c);
        } else {
            return false;
        }
    }
    return stack.isEmpty();
		
	}
}

//sumRange
// Solution.sumRange should return the sum of integers having value between 10 ti 100 inclusive and belonging to the array ints




public class RangeTest1 {

    public static void main(String[] args){

        System.out.println(sumRange(12, 18)); // prints 105
        System.out.println(sumRange(18, 12)); // prints 0
        System.out.println(sumRange(18, 18)); // prints 18
    }

    public static int sumRange(int low, int high)
    {
        int sum = 0;

        for (int val = low; val <= high; val++){
            sum += val;
        }

        return sum;
    }
}
// sometimes the provided implementation returns a wrong sum. 
//For example, Calculator.sum("99.35","1.10") returns 100.44999999999. Modify Calculator.sum(String...numbers)
class calculator{
    static String sum(String ...numbers) {
    double total=0;
    String S = null;
    for (String number:numbers) {
        total+=Double.parseDouble(number);  
    
        String x = String.valueOf(total);
        NumberFormat nf = new DecimalFormat("#.###");
         S = nf.format(total);}
        return String.valueOf(S);
    }
}


class Dog extends Animal {

    Dog(String name){
        this.name=name;
    }

}

class Cat extends Animal {

    Cat(String name){
        this.name=name;
    }

}

class Application{
    static String getAnimalName(Animal a){
        String name=null;
        /*if(a instanceof Dog){
            name=((Dog)a).getName();
        }
        else if(a instanceof Cat){
            name=((Cat)a).getName();
        }*/
        name=a.getName();
        return name;
    }
}