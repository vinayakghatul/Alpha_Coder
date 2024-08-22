package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintArray {

    public static void main(String args[]) {
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(4);
        nums.add(8);
        nums.add(3);
        nums.add(5);

        nums.forEach(num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        });

        nums.size();
        Set<Integer> mySet =  nums.stream().collect(Collectors.toSet());

        System.out.println(mySet.size());
    }
}
