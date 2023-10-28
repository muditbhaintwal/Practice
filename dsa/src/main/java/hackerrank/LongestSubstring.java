package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        String str = "aabbcamnopqrstuvwxyzbcbbxyzabcde";
        System.out.println(findLongestSubstring(str));
    }

    private static int findLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> visitedChars = new HashMap<>(s.length());
        for (int right = 0, left = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (visitedChars.containsKey(c)) {
                int foundAt = visitedChars.get(c);
                if (foundAt >= left) {
                    left = foundAt + 1;
                }
            }
            visitedChars.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }

    private static List<String> getAllSubstrings(String str) {
        List<String> list = new ArrayList<>();

        return list;
    }

}
