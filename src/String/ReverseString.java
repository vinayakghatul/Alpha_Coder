package String;

public class ReverseString {
    public static void main(String args[]) {
        String str = "geeks for geeks";
        String newStr = "";

        for (int i=0;i<str.length();i++) {
            newStr = str.charAt(i) + newStr;
        }
        System.out.println(newStr);
    }
}
