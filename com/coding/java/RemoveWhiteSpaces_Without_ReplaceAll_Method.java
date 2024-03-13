package com.coding.java;

public class RemoveWhiteSpaces_Without_ReplaceAll_Method {
    public static void main(String[] args) {
        String str1 = "R  aga  vi Kum ar esh Ni mall an Aac hu tth an";

        char[] chars = str1.toCharArray();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] != ' ') && (chars[i] != '\t')) {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb);
    }
}