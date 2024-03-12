package com.coding.java;

public class String_Reverse_OR_Palindrome {

    public static void main(String[] args) {

        /* Provide any number or String to validate*/
        String original = "abcdammadcba";
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);
        }

        System.out.println("Given String: " + original);
        System.out.println("Reversed String: " + reverse);

        if (original.equals(reverse)) {
            System.out.println("Given String is a palindrome!!");
        } else {
            System.out.println("Given String is not a palindrome!!");
        }
    }
}