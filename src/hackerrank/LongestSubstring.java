package hackerrank;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

 */
public class LongestSubstring {
    public static void main(String[] args) {
        String str = "wabcabcbb";
        findLongestSubstring(str);
    }

    private static void findLongestSubstring(String str) {
        String longestSubStr = "";
        Set set = new HashSet(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.contains(c)) {
                if(1==1){

                }
                break;
            }
            set.add(c);
        }
    }

}
