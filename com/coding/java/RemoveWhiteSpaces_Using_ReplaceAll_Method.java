package com.coding.java;

public class RemoveWhiteSpaces_Using_ReplaceAll_Method {

    public static void main(String[] args) {
        String input = "R  aga  vi Kum ar esh Ni mall an Aac hu tth an";
        String output = input.replaceAll("\\s", "");
        System.out.println(output);
    }
}