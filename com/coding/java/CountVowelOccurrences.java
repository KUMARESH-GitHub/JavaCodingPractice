package com.coding.java;

import java.util.HashMap;

public class CountVowelOccurrences {

    public static void main(String[] args) {

        String str = "I am an Vowel word";

        HashMap<Character, Integer> vowelCount = new HashMap<>();  // Create a HashMap to store the count of each vowel
        vowelCount.put('a', 0);
        vowelCount.put('e', 0);
        vowelCount.put('i', 0);
        vowelCount.put('o', 0);
        vowelCount.put('u', 0);

        for (int i = 0; i < str.length(); i++) { // Iterate through the string and update the count for each vowel
            char ch = Character.toLowerCase(str.charAt(i));
            if (vowelCount.containsKey(ch)) {
                vowelCount.put(ch, vowelCount.get(ch) + 1);
            }
        }

        System.out.println("Occurrences of each vowel:"); // Print the count of each vowel
        for (char vowel : vowelCount.keySet()) {
            System.out.println(vowel + ":" + vowelCount.get(vowel));
        }
    }
}