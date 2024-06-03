package org.example.Array.Good;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Total Values :: ");
        int value=sc.nextInt();

        int[] arr=new int[value];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the "+(i+1)+" value :: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Details :: ");
        for(int arr1: arr){
            System.out.print(arr1+" ");
        }

        System.out.println();
        System.out.println("size of array :: "+arr.length);
    }
}