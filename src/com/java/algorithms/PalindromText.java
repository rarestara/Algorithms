package com.java.algorithms;

public class PalindromText {

    public static void main(String[] args) {
        String text = "aerisirea";
        char[] arr = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder reversesb = new StringBuilder();
        char ch;
        char rev;
        for (int i = 0; i < arr.length; i++) {
            ch = arr[i];
            rev = arr[arr.length - 1 - i];
            sb.append(ch);
            reversesb.append(rev);
        }
        if (sb.toString()
                .equals(reversesb.toString())) {
            System.out.println("Textul este palindrom");
        } else {
            System.out.println("Textul nu este palindrom");
        }
    }
}
