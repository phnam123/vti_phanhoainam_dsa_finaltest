package org.example;

public class bai2_2 {
    public static void main(String[] args) {
        int n = 123432;
        PrintDigits(n);
    }

    public static void PrintDigits (int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }
    }
}