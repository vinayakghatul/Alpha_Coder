package Stack;

import java.util.Stack;

public class BalanceParenthesis {

    public static void main(String args[]) {
        String str = "[()]{}{[()()]()";

        Stack<Character> stk = new Stack<>();

        for (int i=0;i< str.length();i++) {
            if (str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '{') {
                stk.push(str.charAt(i));
            } else {
                if (str.charAt(i) == ']' && stk.peek() == '[') {
                    stk.pop();
                } else if (str.charAt(i) == '}' && stk.peek() == '{') {
                    stk.pop();
                } else if (str.charAt(i) == ')' && stk.peek() == '(') {
                    stk.pop();
                } else {
                    //
                }
            }
        }
        if (stk.empty()) {
            System.out.println("Valid parenthesis");
        } else {
            System.out.println("Invalid");
        }
    }


}
