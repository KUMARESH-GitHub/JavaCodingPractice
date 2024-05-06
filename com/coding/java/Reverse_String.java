package com.coding.java;

public class Reverse_String {

    public static void main(String[] args) {
        /* Provide any number or String to validate*/
        String original1 = "123456789 12341234 999888777665";
        String original = "I am Kumaresh and I am the Automation Tester";
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Given String: " + original);
        System.out.println("Reversed String: " + reverse);

        if (original.equalsIgnoreCase(reverse)) {
            System.out.println("Given String is a palindrome!!");
        } else {
            System.out.println("Given String is not a palindrome!!");
        }
    }
}