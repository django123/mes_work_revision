package java_code;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args){
        Predicate<String> predicate = (String s) -> {
            return s.length() == 3;
        };
    
        // expression simplifier
    
        Predicate<String> predicate2 = s -> s.length() == 3;
        Consumer<String> consumer = s -> System.out.println(s);
    }
   
    
}
