package com.java.algorithms;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        // int, long, char, float, double
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        long fact= factorial(number);
        System.out.print("The factorial is: ");
        System.out.println(fact);
    }

    private static long factorial(int n){
        if(n==0) return 1;
        long  prod=1;
        for(int i=2;i<=n;i++) {
            prod = prod * i;
        }
        return prod;
    }
}
