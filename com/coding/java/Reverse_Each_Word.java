package com.coding.java;

public class Reverse_Each_Word {

    public static void main(String[] args) {
        reverseEachWordOfString("I am Kumaresh and I am the Automation Tester");
    }

    static void reverseEachWordOfString(String inputString) {

        String[] words = inputString.split(" ");

        String reverseString = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            if (word.equalsIgnoreCase(reverseWord)) {
                System.out.println("Given String is a palindrome!!" + word);
            }

            //reverseString = reverseString + reverseWord + " ";
            reverseString = reverseWord + " " + reverseString;
        }

        System.out.println("Input: " + inputString);

        System.out.println("Output: " + reverseString);
    }
}