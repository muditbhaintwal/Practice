package leetcode.blind75;

/*
https://leetcode.com/problems/valid-palindrome/description/

find if given alphanumeric string is palindrome ignoring case.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama!";

        //1- Reverse the string and compare. It will take extra space and time.
        //2- Using two pointers
        boolean isPalindrome = twoPointer(str);
        System.out.println(isPalindrome);
    }

    /*
    Using two pointers. left at start and right at end. Loop until they both crossed(even length) or met(odd length) with each other.

    time o(n)
    space o(1)

     */

    private static boolean twoPointer(String str) {
        boolean result = true;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            char c1 = str.toLowerCase().charAt(left);
            char c2 = str.toLowerCase().charAt(right);

            if (c1 != c2) {
                result = false;
                break;
            }
            left++;
            right--;
        }
        return result;
    }
}
