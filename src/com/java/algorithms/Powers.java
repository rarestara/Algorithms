package com.java.algorithms;

import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        System.out.println("Powers");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = scan.nextInt();
        System.out.print("Please enter second number: ");
        int b = scan.nextInt();
        System.out.print("a empowered by b is: " + powerFunction(a,b));

    }
    public static long powerFunction ( int a, int b){
            long p = 1;
            for(int i=1; i<=b; i++){
               p = p*a ;
           }

            return p;
    }
}
