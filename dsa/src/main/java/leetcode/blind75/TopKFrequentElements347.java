package leetcode.blind75;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKFrequentElements347 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};  // {3,0,0,2,0,1}
        int k = 2;
        topKFrequent(nums, k);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1 && k == 1) {
            return nums;
        }

        Map<Integer, Integer> mapOfFreqAndNumbers = new HashMap<>(); // {1->3, 2->2, 3->1}

        for (int i = 0; i < nums.length; i++) {
            mapOfFreqAndNumbers.put(nums[i], mapOfFreqAndNumbers.getOrDefault(nums[i], 1) + 1);
        }

        int[] result = new int[k];
        //mapOfFreqAndNumbers.keySet()

        for (int i = 0; i < k - 1; i++) {

        }
        return nums;
    }
}


