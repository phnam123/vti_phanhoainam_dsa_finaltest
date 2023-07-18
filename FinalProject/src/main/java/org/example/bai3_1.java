package org.example;

public class bai3_1 {
    public static void main(String[] args) {
        int[] A = {1, 23, 4, 5, 6, 78, 8, 2, 32, 2, 32, 432, 32, 234, 432, 1, 432, 324};
        int length = A.length;

        for (int i=0;i < length/2;i++) {
            int temp = A[i];
            A[i] = A[length-1-i];
            A[length-1-i] = temp;
        }


        for (int i=0;i< length;i++) {
            System.out.print(A[i] + " ");
        }
    }
}