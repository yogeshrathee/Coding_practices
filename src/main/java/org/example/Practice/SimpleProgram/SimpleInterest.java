package org.example.Practice.SimpleProgram;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();

        double interest=(p*r*t)/100;
        System.out.println("Interest:: "+interest+" Rs.");

        double totalAmount=interest+p;
        System.out.println("Total Amount:: "+totalAmount+" Rs.");
    }
}
