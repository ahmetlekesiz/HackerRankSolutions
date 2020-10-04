package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingChars {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        if(s.length() == 0){
            return 0;
        }
        char currentChar = s.charAt(0);
        int counter = 0;
        int totalDeletion = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == currentChar){
                counter++;
                if (i == s.length()-1){
                    totalDeletion += counter;
                }
            }else if(s.charAt(i) != currentChar && counter>=1){
                totalDeletion += counter;
                counter = 0;
            }
            currentChar = s.charAt(i);
        }
        return totalDeletion;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int result = alternatingCharacters("AABBBBAAABBBAAAABABBABBA");
    }
}
