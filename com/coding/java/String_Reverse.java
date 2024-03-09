package com.coding.java;

public class String_Reverse {

    public static void main(String[] args)
    {
        String word = "AMMAAMMA";

        String temp = "";

        for(int i=word.length()-1 ; i>= 0 ; i--){

            temp = temp +word.charAt(i);
        }

        System.out.println("Given String: " + word);
        System.out.println("Reversed String: " + temp);

        if(word.equals(temp)){
            System.out.println("Given String is a palindrome!!");
        }
        else{
            System.out.println("Given String is not a palindrome!!");
        }
    }

}
