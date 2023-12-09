package org.mudit.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        int n = 13;
        int[] array = {3, 4, 12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5};

        ArrayList<Integer> duplicates = duplicates(array, n);
        duplicates.forEach(System.out::println);

    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Set<Integer> aset = new HashSet<>();
        Set<Integer> resultSet = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (aset.contains(arr[i])) {
                resultSet.add(arr[i]);
            } else {
                aset.add(arr[i]);
            }
        }


        if (resultSet.isEmpty()) {
            resultSet.add(-1);
        }
        //System.out.println(resultSet);

        return new ArrayList<Integer>(resultSet);

    }
}
