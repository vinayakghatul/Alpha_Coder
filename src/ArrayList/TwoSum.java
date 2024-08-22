package ArrayList;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        //find pair that sums to target in numbers array
        List<Integer> ans = new ArrayList<>();

        //use extra space for map

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            mp.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int tmp = mp.get(target - numbers[i]);
            if (Objects.nonNull(tmp)) {
                ans.add(i);
                ans.add(tmp);
                break;
            }
        }

        ans.forEach(a -> System.out.println(a));
    }
}
