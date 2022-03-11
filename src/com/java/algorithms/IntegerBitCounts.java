package com.java.algorithms;

public class IntegerBitCounts {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        while (num > 0) {
            count += num % 2;
            num = num / 2;
        }
        System.out.println("count is " + count);
    }
}

