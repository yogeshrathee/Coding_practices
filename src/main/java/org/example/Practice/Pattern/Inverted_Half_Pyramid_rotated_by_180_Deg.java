package org.example.Practice.Pattern;
import java.util.*;

public class Inverted_Half_Pyramid_rotated_by_180_Deg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
