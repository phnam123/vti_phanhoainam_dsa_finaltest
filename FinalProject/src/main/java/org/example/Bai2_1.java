package org.example;

import javax.swing.*;

public class Bai2_1 {
    public static void main(String[] args) {
        int n = 123432;
        System.out.println(isPalindrome(n));

    }

    static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int length = str.length();
        for (int i = 0; i< length/2; i++) {
            if (str.charAt(i) != str.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }
}
