package com.coding.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Remove_Tailing_String {
    public static void main(String[] args) {

        /* Method-1 */
        String input = "aaabat";
        String result = input.replaceAll("(.)\\1+", "");
        System.out.println(result);

        /* Method-2 */
        String givenString = "aaabat";
        String resultString = givenString.replaceAll("^aaa", "");
        System.out.println(resultString);

        /* Method-3 */
        String str = "aaabat";
        String output = str.substring(3);
        System.out.println(output);

        /* Method-4 */
        Pattern pattern = Pattern.compile(result);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.pattern());
    }
}