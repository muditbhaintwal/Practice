package org.mudit.dsa;

/**
 * https://www.geeksforgeeks.org/problems/upper-case-conversion5419
 */
public class UpperCaseConversion {

    public static void main(String[] args) {
        //String s = "i love india";

        String s = "cg ax uv dm snjc ws a x nkr wdh ofni x bgxod m m r x kus a yap ajil bvmckzgnonlwuz azuvb";
        System.out.println(transform(s));
    }

    static String transform(String s) {
        // code here
        String result = s;

        /*
        DOnt use split as you need to join it again.
        */


        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else if (charArray[i] == ' ') {
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
            }
        }

        return String.copyValueOf(charArray);
    }
}
