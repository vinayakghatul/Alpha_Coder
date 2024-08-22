package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class FindPeak {
    public static void main(String arsg[]) {

        List<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(3);
        nums.add(7);
        nums.add(6);
        nums.add(8);

        if (nums.size() == 1) {
            System.out.println(nums.get(0));
        }
        int n = nums.size();
        if (nums.get(0) > nums.get(1) && nums.get(0) > nums.get(n-1)) {
            System.out.println(nums.get(0));
        }

        for (int i=1;i<n;i++) {
            if (nums.get(i) > nums.get(i-1) && nums.get(i) > nums.get((i+1)%n)) {
                System.out.println(nums.get(i));
            }
        }
    }
}
