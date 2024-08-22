package Ace.Leetcode_75;

import java.util.Scanner;

public class MergeStrings {

    public static String mergeAlternatively(String word1, String word2) {

        int n1 = word1.length();
        int n2 = word2.length();

        String res = "";

        if (n1 >= n2) {
            for (int i =0;i<n2;i++) {
                res = res + word1.charAt(i) + word2.charAt(i);
                //System.out.println(res);
            }
            res = res + word1.substring(n2,n1);
        } else {
            for (int i =0;i<n1;i++) {
                res = res + word1.charAt(i) + word2.charAt(i);
            }
            res = res + word2.substring(n1, n2);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take input string
        String word1 = sc.nextLine();
        
        String word2 = sc.nextLine();

        String res = mergeAlternatively(word1, word2);

        System.out.println(res);

    }
}
