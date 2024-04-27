package leetcode;

import java.util.Arrays;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2};
        System.out.println(removeDuplicates(nums));
        Arrays.stream(nums).forEach(System.out::print);
    }


    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int dupCount = 0;
        for (int i = 0; i < nums.length - dupCount; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                k++;
                nums[k] = nums[i];
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
        System.out.println(k);
        return k + 1;
    }
}
