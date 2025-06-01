package Ace.Leetcode_150;

public class Last_Word_String {

    public int lengthOfLastWord(String s) {
        // trim string to remove front and last spaces
        s.trim();
        String[] arr = s.split(" ");

        int n = arr.length;

        return arr[n-1].length();
    }


    public static void main(String args[]) {
        String s = "I am vinayak ";
        Last_Word_String lastWordString = new Last_Word_String();
        System.out.println(lastWordString.lengthOfLastWord(s));
    }
}
