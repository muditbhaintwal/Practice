package org.mudit.dsa;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/sha-256/copy-from/242942594
 */

public class Sha256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        //String s1 = sc.next();
        String s1 = "K1t4fo0V";
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        if ((s1.length() >= 6 && s1.length() <= 20) && pattern.matcher(s1).matches()) { // defined length alphnumeric strings as input
            // Static getInstance method is called with hashing SHA
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            // digest() method called to calculate message digest of an input and return array of byte
            byte[] hash = md.digest(s1.getBytes(StandardCharsets.UTF_8));
            // Convert byte array into signum representation
            BigInteger number = new BigInteger(1, hash);

            // Convert message digest into hex value
            String strHashCode = number.toString(16);

            // pad with 0 if the hexa digits are less then 64.
            while (strHashCode.length() < 64) {
                strHashCode = "0" + strHashCode;
            }


            System.out.println(strHashCode);
        }

    }
}