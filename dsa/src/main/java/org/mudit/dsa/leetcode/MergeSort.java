package org.mudit.dsa.leetcode;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 5, 6, -2, 1, 0};
        mergeSort(nums, 0, nums.length - 1);
        Arrays.stream(nums).forEach(System.out::print);
    }

    /*
    Algo
    Its a divide and conquer algo.
    It needs an extra array to sort and merge the results.
    Divide - divide the array into half recursively until we found single element.
    conquer - sort and merge the arrays recursively.
     */
    private static void mergeSort(int[] nums, int startIndex, int endingIndex) {
        // base case
        if (startIndex >= endingIndex) {
            return;
        }

        int mid = startIndex + (endingIndex - startIndex) / 2;
        mergeSort(nums, startIndex, mid);
        mergeSort(nums, mid + 1, endingIndex);
        merge(nums, startIndex, mid, endingIndex);

    }

    private static void merge(int[] nums, int startIndex, int mid, int endingIndex) {
        // Extra merged array
        int[] merged = new int[endingIndex - startIndex + 1];

        // indexes to keep track of arrays
        int idxArr1 = startIndex;
        int idxArr2 = mid + 1;
        int idxMergedArr = 0;

        while (idxArr1 <= mid && idxArr2 <= endingIndex) {
            //compare two array and put the smallest one in the merged array
            if (nums[idxArr1] <= nums[idxArr2]) {
                merged[idxMergedArr] = nums[idxArr1];
                idxArr1++;
                idxMergedArr++;
            } else {
                merged[idxMergedArr] = nums[idxArr2];
                idxArr2++;
                idxMergedArr++;
            }
        }

        // if any array exhausted, copy all elements from another array to merged array

        while (idxArr1 <= mid) {
            merged[idxMergedArr] = nums[idxArr1];
            idxArr1++;
            idxMergedArr++;
        }

        while (idxArr2 <= endingIndex) {
            merged[idxMergedArr] = nums[idxArr2];
            idxArr2++;
            idxMergedArr++;
        }

        // copy merged array to main array
        int idx = startIndex;
        for (int j : merged) {
            nums[idx] = j;
            idx++;
        }
    }
}
