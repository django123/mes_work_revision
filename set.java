import java.util.HashSet;
import java.util.Iterator;

public class Set {

    public static void main(String... args) {

        HashSet s = new HashSet<>();

        s.add(12);
        s.add("Merci");
        s.add("Toto");
        s.add(null);
        s.add(1.0f);

        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nParcours avec un tableau d'objet");
        System.out.println("-----------------------------------");

        Object[] ob = s.toArray();

        for (Object object : ob) {
            System.out.println(object);
        }
    }

}
