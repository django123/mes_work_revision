package codingame;

import java.util.ArrayDeque;
import java.util.Deque;

//implement the method check(String str) to
// check the correctness of string of this type.check return true if the string is correct, false otherwise
public class Check {



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
