package org.example.Practice.SimpleProgram;

import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ele=sc.next();

        StringBuilder str=new StringBuilder();
        char[] chars=ele.toCharArray();

        for(int i=chars.length-1;i>=0;i--){
            str.append(chars[i]);
        }
        System.out.println(str);
    }
}