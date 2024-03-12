package com.coding.java;

import java.util.Scanner;

public class SwapTwoStrings {

    public static void main(String[] args) {

        SwapTwoStringsUsingTempVariable();
    }

    public static void SwapTwoStringsUsingTempVariable() {

        String one  = "Kumaresh";
        String two  = "Ragavi";
        String temp = "";

        System.out.println("Before Swapping: " + '\n' + "String 1: " + one + '\n' + "String 2: " + two);

        temp = one;
        one = two;
        two = temp;

        System.out.println("After Swapping: " + '\n' + "String 1: " + one + '\n' + "String 2: " + two);
    }
}