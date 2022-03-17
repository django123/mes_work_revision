import java.util.HashMap;
import java.util.Map;

public class Exercice {
    
    public static void main(String [] args){


        Map<String, String> map = new HashMap<>();

        map.put("A", "Blue");
        map.put("A", "Red");
        map.put("A", "Blue");
        map.put("A", "Blue");
        map.put("B", "Green");
        map.put("B", "Purple");
        map.put("B", "Purple");
        map.put("B", "Green");
        map.put("C", "Black");

        //on parcours la map avec un forEach
        map.forEach((k,v) -> System.out.println("Key: " + k + " Value: " +v));




    /*
      for(Map.Entry<String, String> entry : map.entrySet()){

        System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

      } */     
    }
}
