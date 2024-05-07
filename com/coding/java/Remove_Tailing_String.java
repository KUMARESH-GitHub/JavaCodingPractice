package com.coding.java;

public class Remove_Tailing_String {
    public static void main(String[] args) {
        String input = "aaabat";
        String result = input.replaceAll("(.)\\1+", "");
        System.out.println(result);
    }
}