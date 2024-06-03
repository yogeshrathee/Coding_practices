package org.example.Practice.Pattern;

import java.util.Scanner;

public class Inverted_half_Pyramid_With_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=number;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
