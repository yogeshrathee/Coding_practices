package org.example.Practice.Pattern;

import java.util.Scanner;

public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j=num;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
