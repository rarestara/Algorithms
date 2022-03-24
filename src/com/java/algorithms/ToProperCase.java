package com.java.algorithms;

public class ToProperCase {
    static String getPropCase(String a) {
        a=a.toLowerCase();

        a=a.substring(0,1).toUpperCase() + a.substring(1);

        return a;
    }
    public static void main(String[] args) {
        String text;
        String result = "";
        String word;

        text = "obla    DIla diRI darli DA la la";
        while(text.contains("  ")) {
            text = text.replaceAll("  ", " ");
        }
        String[] str = text.split(" ");

        for(int i = 0; i < str.length; i++) {

            word = getPropCase(str[i]);
            result = (result +" "+ word).trim();
        }
        System.out.println(result);
    }
}
