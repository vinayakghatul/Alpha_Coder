package Ace.Leetcode_75;

import java.util.Scanner;

public class GcdStrings {

    public static String gcdStrings(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();

        // GCD does not exist case ex. "LEET" & "CODE"
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(n1, n2);

        return str1.substring(0, gcdLength);
    }

    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1%n2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        String str2 = sc.nextLine();

        System.out.println(gcdStrings(str1, str2));

    }
}
