package com.coding.java;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Number_UsingSet {


    public static void main(String[] args)
    {
        int numbers [] = {1,2,3,4,1,2,1,6,7,4,5,8};
        Set<Integer> set=new HashSet<>();
        for(int i: numbers) {
            set.add(i);
        }

        System.out.println("Unique Numbers: "+set);
    }

}


