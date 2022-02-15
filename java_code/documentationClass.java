import java.util.Arrays;
import java.util.List;

public class DocumentationClass {
     public static void main(String[] args) {

        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);

     System.out.println(GenerateMessage.generateMessage());
     System.out.println(AnotherMessage.generateAnotherMessage());    
    
     List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        /*
        for(Integer number : numbers) {
            System.out.println("Number: " +number);
            numbers.forEach(number -> System.out.println(" Number: " +number));
        }*/
        numbers.forEach(System.out::println);

        
    }
    
}

class GenerateMessage{
    static String generateMessage() {
        return "Here is one message";
    }
}

class AnotherMessage {
    static String generateAnotherMessage(){
        return " Here is another message";
    }
}

public interface Welcome {
    abstract void welcome(String string);

}
