package ArrayList;

import java.util.Arrays;

public class MinXORValue {

    public static int minXOR(int[] arr, int n) {

        Arrays.sort(arr);
        int minXORValue = Integer.MAX_VALUE;

        for (int i=0;i<arr.length-1;i++) {
            minXORValue = Math.min(minXORValue, arr[i]^arr[i+1]);
        }

        return minXORValue;
    }



    // Driver program
    public static void main(String args[])
    {
        int arr[] = { 9, 5, 3 };
        int n = arr.length;
        System.out.println(minXOR(arr, n));
    }
}
