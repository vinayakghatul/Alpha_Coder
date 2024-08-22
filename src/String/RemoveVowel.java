package String;

import java.util.Scanner;

public class RemoveVowel {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str);
    }
}
