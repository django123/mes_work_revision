import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collection {

    public static void main(String[] args) {

        List l = new LinkedList<>();
        l.add("un");
        l.add("toto");
        l.add(12.0f);
        l.add(12);

        for (int i = 0; i < l.size(); i++) {
            System.out.println("Element à l'index " + i + " = " + l.get(i));
            System.out.println("\n \tParcours avec un itérateur ");
            System.out.println("-----------------------------------");
            ListIterator li = l.listIterator();

            while (li.hasNext()) {
                System.out.println(li.next());
            }
        }

        ArrayList al = new ArrayList<>();
        al.add(15);
        al.add("Une liste");
        al.add(null);

        for (int i = 0; i < al.size(); i++) {
            System.out.println("-----------------------------------");
            System.out.println("Element à l'index " + i + " = " + al.get(i));

        }
    }

}
