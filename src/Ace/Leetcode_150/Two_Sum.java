package Ace.Leetcode_150;

public class Two_Sum {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;

        int[] result = new int[2];

        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i+1;
                result[1] = j+1;
                break;
            } else if (target > numbers[i] + numbers[j]) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int[] nums = {2,7,33,44,55,91};
        int target = 9;

        Two_Sum twoSum = new Two_Sum();

        int[] res = twoSum.twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
