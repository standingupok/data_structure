import java.lang.reflect.Array;

public class StringReverse {
    public static String reverseString(String str) {
        ArrayStack<Character> stack = new ArrayStack<Character>();
        for(int i = 0 ; i < str.length() ; i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
