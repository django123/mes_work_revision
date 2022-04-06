package codingame;

import java.text.DecimalFormat;
import java.text.NumberFormat;

// sometimes the provided implementation returns a wrong sum. 
//For example, Calculator.sum("99.35","1.10") returns 100.44999999999. Modify Calculator.sum(String...numbers)
public class Calculator {

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
