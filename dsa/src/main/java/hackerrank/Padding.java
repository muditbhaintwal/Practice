package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 */

public class Padding {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> aList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int remaining = 15 - s1.length();
            String padding = "";

            for (int i1 = 0; i1 < remaining; i1++) {
                padding = padding + " ";
            }

            String num;
            if (x < 10) {
                num = "00" + x;
            } else if (x < 100) {
                num = "0" + x;
            } else {
                num = x + "";
            }
            aList.add(s1 + padding + num);
        }

        System.out.println("================================");
        aList.forEach(System.out::println);
        System.out.println("================================");

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List tempList = new ArrayList();
        tempList.addAll(a);

        for (int i = 0; i <= d - 1; i++) {
            Integer item = a.get(i);
            tempList.remove(item);
            tempList.add(item);
        }
        return tempList;
    }
}




