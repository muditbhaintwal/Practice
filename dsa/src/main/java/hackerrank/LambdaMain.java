package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true
 * <p>
 * This Java 8 challenge tests your knowledge of Lambda expressions!
 * <p>
 * Write the following methods that return a lambda expression performing a specified action:
 * <p>
 * hackerrank.PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
 * hackerrank.PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
 * hackerrank.PerformOperation isPalindrome(): The lambda expression must return true  if a number is a palindrome or false if it is not.
 * Input Format
 * <p>
 * Input is handled for you by the locked stub code in your editor.
 * <p>
 * Output Format
 * <p>
 * The locked stub code in your editor will print  lines of output.
 * <p>
 * Sample Input
 * <p>
 * The first line contains an integer,  (the number of test cases).
 * <p>
 * The  subsequent lines each describe a test case in the form of  space-separated integers:
 * The first integer specifies the condition to check for ( for Odd/Even,  for Prime, or  for Palindrome). The second integer denotes the number to be checked.
 * <p>
 * Input
 * 5
 * 1 4
 * 2 5
 * 3 898
 * 1 3
 * 2 12
 * Sample Output
 * <p>
 * EVEN
 * PRIME
 * PALINDROME
 * ODD
 * COMPOSITE
 */


interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return a -> a != 0 && a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return a -> {
            if (a == 1 || a == 2) {
                return true;
            }

            for (int i = a - 1; i > 1; i--) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        // palindrome using string. This can work even with huge int
        return a -> {
            String s1 = String.valueOf(a);
            if (s1.length() == 1) {
                return true;
            }
            int maxLoop = (int) (Math.floor(s1.length()) / 2);
            for (int i = 0; i < maxLoop; i++) {
                if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        };
    }
}

// Write your code here

public class LambdaMain {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
