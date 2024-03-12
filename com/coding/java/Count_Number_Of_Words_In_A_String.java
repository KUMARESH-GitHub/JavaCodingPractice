package com.coding.java;


import java.util.HashMap;

public class Count_Number_Of_Words_In_A_String {

    public static void main(String[] args) {

        String str = "I am Kumaresh and I am the Automation Tester and Lead";
        String[] split = str.split(" ");

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for (int i=0 ; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
}