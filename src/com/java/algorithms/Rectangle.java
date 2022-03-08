package com.java.algorithms;

public class Rectangle {
    public static void main(String[] args) {
        drawFullShape(6, 8);
    }

    public static void drawFullShape(int height, int width) {
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}

