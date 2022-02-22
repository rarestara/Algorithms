package com.java.algorithms;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Palindrom");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = keyboard.nextInt();
        if (n > 1000000000){
            System.out.println("Please enter a smaller number");
        }
        int mirror=0, temp;
        temp=n;
        while(temp>0){
            mirror = mirror*10+temp%10;
            temp = temp/10;
        }
        System.out.println(mirror);
        if(n==mirror){
            System.out.println("This is a palindrom");
            } else {
            System.out.println("This is not a palindrom");
            }

        }
}
