package leetcode.blind75;

import java.util.Arrays;

/*
https://leetcode.com/problems/product-of-array-except-self/description/

Given an integer array nums, return an array answer such that answer[i] is equal to the product of
all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */
public class ProductOfArrayExceptSelf238 {
    /*
    NOte:
    1- you cant use division solution.dividing product of whole array with each number.
    2- You should not use extra space.
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Arrays.stream(productExceptSelf(nums)).forEach(i -> System.out.print(i + " ,"));
    }

    /*
        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] prefixPro = new int[nums.length];
        int[] postfixPro = new int[nums.length];

        //calculate prefixProduct  {1,1,2,6}
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefixPro[0] = 1;
            } else {
                prefixPro[i] = prefixPro[i - 1] * nums[i - 1];
            }
        }

        // start from end and calculate postfixProduct  {24,12,4,1}
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                postfixPro[nums.length - 1] = 1;
            } else {
                postfixPro[i] = postfixPro[i + 1] * nums[i + 1];
            }

        }
        // Output: [24,12,8,6]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefixPro[i] * postfixPro[i];
        }
        return nums;
    }

}
