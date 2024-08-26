package Ace.Leetcode_75;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithCandy {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandy = 0;
        for (int i=0; i<candies.length;i++) {
            if (maxCandy < candies[i]) {
                maxCandy = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();

        for (int j=0;j< candies.length;j++) {
            if (candies[j] + extraCandies >= maxCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        //n = sc.nextInt();

        int extraCandies;
        extraCandies = 1;

        int[] arr = new int[]{4,2,1,1,2};

        //candies = [4,2,1,1,2], extraCandies = 1

        List<Boolean>res = kidsWithCandies(arr, extraCandies);

        for (int i=0; i< res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
}
