package hackerrank;

/**
 * You are given a string containing characters A and B only. Your task is to change it into a string such that there
 * are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.
 *
 * Your task is to find the minimum number of required deletions.
 *
 * Example
 * s="ABABABAA"
 * 1 deletion required at the end
 *
 * https://www.hackerrank.com/challenges/alternating-characters/problem
 */
public class AlternatingCharacters {
    public static void main(String[] args) {
        String s = "ABABABABABA";
        removeRecurringChar(s);
    }

    private static int removeRecurringChar(String s) {
        char last = s.charAt(0);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (last == current) {
                count++;
            }
            last = current;
        }
        System.out.println(count);
        return count;
    }
}
