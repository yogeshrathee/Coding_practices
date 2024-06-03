package org.example.Practice.SimpleProgram;

import java.util.Scanner;

public class Sum_Of_Array_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int size=sc.nextInt();

        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);

    }
}
