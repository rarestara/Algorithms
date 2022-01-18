package com.java.algorithms;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = scan.nextInt();
        System.out.print("Please enter second number: ");
        int b = scan.nextInt();
        System.out.print("Please enter opperator O: ");
        char 'O' = scan.nextInt();

        private double Sum ( int a, int b){
            return a + b;
        }
        private double Difference (int a, int b){
            return a - b;
        }
        private double Product ( int a, int b){
            return a * b;
        }
        private double Divide ( int a, int b){
            return a / b;
        }
        if char ('O' == '+') {
            System.out.print("Sum is: " + Sum);
        }
        else if (char 'O' == '-' ){
            System.out.print("Difference is: " + Difference);
        }
        else if (char 'O' == '*' ){
            System.out.print("Product is: " + Product);
        }
        else if (char 'O' == '/' ){
            System.out.print("Divide is: " + Divide);
        }
        else{
            System.out.println("Wrong opperation.Please enter one of the valid opperations: + or - or * or /");
            return;
        }
    }
}