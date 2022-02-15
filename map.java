import java.util.Enumeration;
import java.util.Hashtable;

public class Test {

    public static void main(String[] args) {

        Hashtable ht = new Hashtable<>();
        ht.put(1, "printemps");
        ht.put(2, "été");
        ht.put(10, "autonome");
        ht.put(45, "hiver");

        Enumeration en = ht.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }

}
