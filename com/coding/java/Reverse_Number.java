package com.coding.java;

public class Reverse_Number {

    public static void main(String args[]) {

        int num = 123456789, reversed = 0;

        System.out.println("Given Number: " + num);

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}