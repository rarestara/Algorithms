package com.java.algorithms;
/* Problem to solve: to print all the numbers from 1 to 100,
exception the multiples of 3, when we print "Fizz",
multiples of 5, when we print "Buzz"
and multiples of 15, when we print "FizzBuzz"
 */
// defining public class
public class FizzBuzz {

    public static void main(String[] args) {
        //Starting the loop to cross from 1 to 100
        for (int i = 1; i <= 100; i++) {
// Setting the conditions
            if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0 ){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}