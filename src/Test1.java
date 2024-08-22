import java.util.Stack;

public class Test1 {

    public static void main(String args[]) {

        String str = "{()[][()()])}";

        //String str = "{{{}}}}";

        Stack<Character> stk = new Stack<>();

        int c1 =0;
        int c2 =0;

        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stk.push(str.charAt(i));
                c1++;
            }
            else {
                switch (str.charAt(i)) {
                    case ')':
                        c2++;
                        if (!stk.empty() && stk.peek() == '(') {
                            stk.pop();
                        }
                        break;
                    case '}':
                        c2++;
                        if (!stk.empty() && stk.peek() == '{') {
                            stk.pop();
                        }
                        break;
                    case ']':
                        c2++;
                        if (!stk.empty() && stk.peek() == '[') {
                            stk.pop();
                        }
                        break;
                    default:
                        System.out.println("Invalid Character");
                }
            }
        }

        if (stk.empty() && (c1==c2)) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
    }
}
