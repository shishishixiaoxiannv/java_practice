import java.util.HashMap;
import java.util.Stack;

public class LC20_2 {
    public boolean isValid(String s) {
        int len = s.length();

        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(']', '[');
        hashMap.put(')', '(');
        hashMap.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < len; i++ ) {
            char ch = s.charAt(i);
            if(hashMap.containsKey(ch)) {
                if(stack.empty() || stack.peek() != hashMap.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

            return stack.empty();
    }
}
