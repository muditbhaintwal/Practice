package hackerrank;

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

    private static void getIndices(int[] array, int target) {
        Map itemsMap = new HashMap(array.length);
        for (int j = 0; j < array.length; j++) {
            itemsMap.put(array[j], j);
            int lookingFor = target - array[j];
            if (itemsMap.keySet().contains(lookingFor)) {
                Integer index = (Integer) itemsMap.get(lookingFor);
                if (index != j) {
                    System.out.println("Indices are " + j + " and " + index);
                    //break;
                }
            }
        }
    }
}
