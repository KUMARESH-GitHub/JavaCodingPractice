package com.coding.java;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        SwapTwoNumbersUsingTempVariable();
        SwapTwoNumberWithoutThirdVariable();
    }

    public static void SwapTwoNumbersUsingTempVariable() {

        int num1, num2, temp;

        System.out.println("Enter num1 and num2: ");
        Scanner in = new Scanner(System.in);

        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.println("Before Swapping: " + '\n' + "Number 1: " + num1 + '\n' + "Number 2: " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping: " + '\n' + "Number 1: " + num1 + '\n' + "Number 2: " + num2);
    }

    public static void SwapTwoNumberWithoutThirdVariable() {

        int num1, num2, temp;

        System.out.println("Enter num1 and num2: ");
        Scanner in = new Scanner(System.in);

        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.println("Before Swapping: " + '\n' + "Number 1: " + num1 + '\n' + "Number 2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping: " + '\n' + "Number 1: " + num1 + '\n' + "Number 2: " + num2);
    }
}