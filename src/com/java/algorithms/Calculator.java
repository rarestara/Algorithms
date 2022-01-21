package com.java.algorithms;

import java.util.*;

public class Calculator {

    private static double Sum (long a,long b){
        return a + b;
    }
    private static double Difference ( long a,long b){
        return a - b;
    }
    private static double Product (long a,long b){
        return a * b;
    }
    private static double Divide (long a,long b){
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        long a = keyboard.nextLong();
        System.out.print("Please enter second number: ");
        long b = keyboard.nextLong();
        keyboard.nextLine();
        System.out.print("Please enter opperator: ");

        char c = keyboard.next().charAt(0);
        if (c == '+') {
            System.out.print("Sum is: " + Sum(a,b));
        }

        else if (c == '-' ){
            System.out.print("Difference is: " + Difference(a,b));
        }

        else if (c == '*' ){
            System.out.print("Product is: " + Product(a,b));
        }
        else if (c == '/' ){
            System.out.print("Divide is: " + Divide(a,b));
        }
        else{
            System.out.println("Wrong opperation.Please enter one of the valid opperations: + or - or * or /");

        }
    }
}
