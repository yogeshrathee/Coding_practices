package org.example.Practice.Pattern;

import java.util.Scanner;

public class Solid_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();;
        int col=sc.nextInt();

        for(int i=1;i<=row;i++){

            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
