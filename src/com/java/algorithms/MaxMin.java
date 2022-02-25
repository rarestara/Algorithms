package com.java.algorithms;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 23, 34, 45, 2};
        int max = arr[0];
        int min = arr[0];
        int indexOfMax=0;
        int indexOfMin=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax=i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin=i;
            }
        }
        System.out.println("Max is "+max+ " and is at index "+indexOfMax);
        System.out.println("Min is "+min+ " and is at index "+indexOfMin);
    }
}
