import java.util.HashMap;
import java.util.Stack;

public class LC20 {
    public boolean isValid(String s){
        int n = s.length();
        if (n % 2 == 1){
            return false;
        }

        HashMap<Character, Character> hashMap = new HashMap<>();
////        hashMap.put(')', '(');
////        hashMap.put('}', '{');
////        hashMap.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            } else if(ch == ']' || ch == '}' || ch == ')'){
                if(stack.empty()){
                    return false;
                }
                char top = stack.peek();
                if((ch == ']' && top == '[') ||
                        (ch == '}' && top == '{') ||
                        (ch == ')' && top == '(')){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if(stack.empty()) {
            return true;
        }

        return false;
    }
}
