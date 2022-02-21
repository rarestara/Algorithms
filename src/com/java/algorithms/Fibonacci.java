package com.java.algorithms;

import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter n number: ");
        int n = keyboard.nextInt();
        /* int[] fibonacciSequence= new int[n];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1]= 1;
        for(int i=2;i<n;i++) {
            fibonacciSequence[i] = fibonacciSequence[i-1] +fibonacciSequence[i-2];

        }
        System.out.println("Fibonacci sequence for this number is "+ Arrays.toString(fibonacciSequence));
*/
        //Alternative solution with recursive function//
        System.out.println("Fibonacci sequence for this number is "+ fib(n));
        }
    public static int fib (int num){
        if (num == 0){
            return 0;
        }
        if (num==1){
            return 1;
        }
        return fib(num-1)+ fib(num-2);
    }


    }


