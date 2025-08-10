package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses20 {

    ValidParentheses20() {
    }

    public boolean isValid(String s) {
        HashMap<Character, Character> parentheses = new HashMap<>();

        parentheses.put('(', ')');
        parentheses.put('{', '}');
        parentheses.put('[', ']');
        parentheses.put('\"', '\"');
        parentheses.put('\'', '\'');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (parentheses.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            if (stack.pop() != parentheses.get(s.charAt(i))) {
                return false;
            }
        }

         return stack.empty();
    }

    public static void main(String[] args) {
        ValidParentheses20 p = new ValidParentheses20();
        System.out.println(p.isValid("()[]{}"));
    }
}
