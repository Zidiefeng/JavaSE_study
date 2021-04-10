package com.kaitan.foundamentals.structure;

public class Demo10 {
    public static void main(String[] args) {
        // odd and even sum from 1-100
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {//odd
                oddSum += i;
            } else {
                evenSum += i;
            }
        }
        System.out.println("OddSum " + oddSum);
        System.out.println("EvenSum " + evenSum);
    }
}

