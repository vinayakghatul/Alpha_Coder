package String;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();

        int i=0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                break;
            } else {
                i++;
                j--;
            }
        }

        if (i > j) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
