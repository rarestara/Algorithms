package com.java.algorithms;

import java.util.Scanner;

public class Piramida {
    public static void main(String[] args) {
        System.out.println("Piramida");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int a = keyboard.nextInt();


        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }

            System.out.println(i);



        }

    }
}


