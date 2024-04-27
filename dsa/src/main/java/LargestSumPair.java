import java.util.Arrays;
import java.util.List;

public class LargestSumPair {

    public static void main(String[] args) {
        // distinct list
        List<Integer> aList = Arrays.asList(10, 2, 5, 2, 7, 9, 8, 6, 3 , 9);

        // duplicates list
        //List<Integer> aList = Arrays.asList(1, 2, 5, 1);
        sum(aList); // O(n^2)

        sum2(aList); //O(n)
    }

    private static void sum2(List<Integer> aList) {
        int sum = aList.size() == 1 ? aList.get(0) : aList.get(0) + aList.get(1);
        for (int i = 2; i < aList.size(); i++) {

            if (i + 1 != aList.size() && aList.get(i) + aList.get(i + 1) > sum) {
                sum = aList.get(i) + aList.get(i + 1);
            }
        }

        System.out.println(sum);
    }

    private static void sum(List<Integer> aList) {
        int sum = -1;
        for (int i = 0; i < (aList.size() - 1); i++) {
            for (int j = i + 1; j < aList.size(); j++) {
                if (aList.get(i) + aList.get(j) > sum) {
                    sum = aList.get(i) + aList.get(j);
                }
            }
        }
        System.out.println(sum);
    }
}
