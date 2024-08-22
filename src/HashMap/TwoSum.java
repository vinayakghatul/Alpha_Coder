package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoSum {

    public static boolean checkSum(int[] arr, int sum) {
        Map<Integer, Integer> values = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            values.put(arr[i], i);
        }

        for (int j = 0; j < n; j++) {
            if (Objects.nonNull(values.get(sum - arr[j]))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int[] arr = {3, 2, 5, 67, 7, 8, 6};
        
        int sum = 100;
        System.out.println(checkSum(arr, sum));
    }
}
