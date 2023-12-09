package org.mudit.dsa;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array and a target number. Provide the indices of two number which sums to target number.
 * Note: you can use same number twice.
 */
public class TwoSum {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 8, 3, 1, 7};
        int target = 9;
        getIndices(array, target);
    }

    private static int[] getIndices(int[] nums, int target) {
        int[] result = new int[2];
        Map itemsMap = new HashMap(nums.length);
        for (int j = 0; j < nums.length; j++) {

            int diff = target - nums[j];
            if (itemsMap.containsKey(diff)) {
                Integer index = (Integer) itemsMap.get(diff);
                System.out.println("Indices are " + j + " and " + index);
                result[0] = index;
                result[1] = j;
                break;
            } else {
                itemsMap.put(nums[j], j);
            }
        }

        return result;
    }
}
