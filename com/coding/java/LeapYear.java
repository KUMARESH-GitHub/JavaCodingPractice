package com.coding.java;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2024;

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {

        if (year % 4 == 0) {  // Leap year is divisible by 4

            if (year % 100 == 0) {  // If divisible by 100, it must also be divisible by 400 to be a leap year
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}