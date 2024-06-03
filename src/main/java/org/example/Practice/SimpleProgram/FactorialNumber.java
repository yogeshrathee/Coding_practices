package org.example.Practice.SimpleProgram;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int num=sc.nextInt();

        for(int i=2;i<=num;i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
