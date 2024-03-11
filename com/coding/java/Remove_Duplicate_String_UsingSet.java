package com.coding.java;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_String_UsingSet {

    public static void main(String[] args) {
        removeDuplicateSetOfStrings();
        removeDuplicateCharacterInString();
    }

    /**
     * Method to remove duplicate string from the set of strings.
     */
    public static Set<String> removeDuplicateSetOfStrings() {

        String values[] = {"Ragavi", "Kumaresh", "Nimallan", "Aachutthan", "Nimallan", "Aachutthan"};
        Set<String> set = new HashSet<>();

        for (String i : values) {
            set.add(i);
        }

        System.out.println(set);

        return set;
    }

    /**
     * Method to remove duplicate character in a given string.
     */
    public static Set<Character> removeDuplicateCharacterInString() {

        String values1 = "Aachutthan";

        Set<Character> set1 = new HashSet<>();

        for (int i = 1; i < values1.length(); i++) {
            set1.add((values1.charAt(i)));
        }

        System.out.println(set1);

        return set1;
    }

}