package org.mudit.dsa;

// https://www.geeksforgeeks.org/java-program-to-check-whether-two-strings-are-anagram-of-each-other/

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        System.out.println(checkAnagram(s1, s2));
    }

    private static boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] charArrayS1 = s1.toCharArray();

            for (int i = 0; i < charArrayS1.length; i++) {
                char c = charArrayS1[i];
                if (!s2.contains(String.valueOf(c))) {
                    return false;
                }
            }
            return true;
        }

    }


}
