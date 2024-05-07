package com.coding.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Remove tailing leter using Pattern & Matcher Technique*/
public class Remove_Tailing_String {

    public static void main(String[] args) {

        String output = "India";

        Pattern pattern = Pattern.compile(output);
        String input = "IIIIIIIIndia";
        Matcher matcher = pattern.matcher(input);

        System.out.println("Output Regex: " + matcher.pattern());
    }
}
