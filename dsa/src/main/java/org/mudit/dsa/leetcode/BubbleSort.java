package org.mudit.dsa.leetcode;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6, 8, 7};
        // in real life you should do   Arrays.sort(nums); which is DualPivotQuicksort
        sort(arr);

    }

    // Start from start and compare first two number, swap if left number is greater than right one.
    // After each pass greatest number will move to the last just like a bubble in sea.
    // so we need not to iterate till end.But every time start from 0 index till length-i

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { // last pair will be a[n-1] and a[n] hence -1
                if (arr[j] > arr[j + 1]) { //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}
