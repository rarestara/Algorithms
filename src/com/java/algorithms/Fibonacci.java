package com.java.algorithms;

import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter n number: ");
        int n = keyboard.nextInt();
        int[] fibonacciSequence= new int[n];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1]= 1;
        for(int i=2;i<n;i++) {
            fibonacciSequence[i] = fibonacciSequence[i-1] +fibonacciSequence[i-2];

        }
        System.out.println("Fibonacci sequence for this number is "+ Arrays.toString(fibonacciSequence));

        }


// 0 1 1 2 3 5 8 13 21 34 55 89
    }


