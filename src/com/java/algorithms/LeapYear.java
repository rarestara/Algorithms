package com.java.algorithms;
import java.util.*;
public class LeapYear {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter one year between 1900-2022: ");

        int a = keyboard.nextInt();

        if (a < 1900 || a > 2022) {

            System.out.println("Please enter a valid year from the period above!");

        } else {

            if ((a % 4 == 0 & a % 100 != 0) || a % 400 == 0) {

                System.out.println("Month february in year " + a + " has 29 days");

            } else {

                System.out.println("Month february in year " + a + " has 28 days");
            }
        }
    }
}
