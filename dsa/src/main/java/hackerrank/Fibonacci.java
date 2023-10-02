package hackerrank;

/*
The Fibonacci Sequence

The Fibonacci sequence appears in nature all around us, in the arrangement of seeds in a sunflower and the spiral of a
nautilus for example.

The Fibonacci sequence begins with  and  as its first and second terms. After these first two elements, each subsequent
element is equal to the sum of the previous two elements.

Programmatically:
fibonacci(0) =0
fibonacci(1) =1
fibonacci(i) = fibonacci(i - 1) + fibonacci(i - 2)


Given n, return the n number in the sequence.
n=5, return 5
fibonacci is 0,1,1,2,3,5
Example

The Fibonacci sequence to  is . With zero-based indexing, .
 */
public class Fibonacci {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(fibonacci(i));
    }

    private static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }

    }

}
