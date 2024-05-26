package org.mudit.dsa.leetcode.blind75;

/*
https://leetcode.com/problems/valid-palindrome/description/

find if given alphanumeric string is palindrome ignoring case.
 */
public class ValidPalindrome125 {
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

    private static boolean twoPointer(String s) {
        if (s.isEmpty()) {
            return true;
        }
        boolean result = true;

        s = s.toLowerCase().replaceAll(" ","").trim();

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

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
