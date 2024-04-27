package org.mudit.dsa;


import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class RotateArray {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = Stream.of(1, 2, 3, 4, 5).collect(toList());

        System.out.println("Input");
        System.out.println(arr);
        List<Integer> res = reverseArray(arr);
        System.out.println(res);
    }


    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here

        int half = a.size() / 2; // int 3/2=1
        for (int i = 0; i < half; i++) {
            int right = a.size() - i - 1;
            int j = a.get(i);
            a.set(i, a.get(right));
            a.set(right, j);
        }

        return a;
    }
}
