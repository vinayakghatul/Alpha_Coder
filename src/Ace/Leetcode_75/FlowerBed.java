package Ace.Leetcode_75;

public class FlowerBed {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        for (int i=0;i<flowerbed.length;i++) {

            // Check if current plot if empty to plant & then check prev and next
            if (flowerbed[i] == 0) {
                boolean prev = (i == 0) || (flowerbed[i-1] == 0);
                boolean next = (i == flowerbed.length - 1) || (flowerbed[i+1] == 0);

                if (prev & next) {
                    flowerbed[i] = 1;
                    n--;
                }

            }

            if (n == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] flowerbed = {1,0,0,0,0,1};
        int n = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));

    }
}
