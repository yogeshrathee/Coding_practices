package org.example.DSA.LinearSearchAlgo;


import java.util.Arrays;
import java.util.Scanner;

public class StringConvertToCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.next();
        convertStringToCharacters(str);
    }
    public static void convertStringToCharacters(String str) {
        System.out.println(Arrays.toString(str.toCharArray()));
    }
}
