package hackerrank;

import java.util.stream.IntStream;

/**
 * Consider the following problem:
 * <p>
 * Write a short program that prints each number from 1 to 100 on a new line.
 * <p>
 * For each multiple of 3, print "Fizz" instead of the number.
 * <p>
 * For each multiple of 5, print "Buzz" instead of the number.
 * <p>
 * For numbers which are multiples of both 3 and 5, print "hackerrank.FizzBuzz" instead of the number.
 * Write a solution (or reduce an existing one) so it has as few characters as possible.
 * <p>
 * Scoring
 * Your score is: (200-no of code line)/100
 * <p>
 * https://www.hackerrank.com/challenges/fizzbuzz/problem
 */


public class FizzBuzz {

    public static void main(String[] args) {

        IntStream.range(1, 101).forEach(i -> {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("hackerrank.FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        });

        // for loop
        /*for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("hackerrank.FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }*/
    }


}
