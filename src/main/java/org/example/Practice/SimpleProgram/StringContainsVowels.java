package org.example.Practice.SimpleProgram;

import java.util.Scanner;

public class StringContainsVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ele=sc.next();

        if(ele.toLowerCase().matches(".*[aeiou].*")){
            System.out.println("present vowel");
        }else {
            System.out.println("not present");
        }
    }
}
