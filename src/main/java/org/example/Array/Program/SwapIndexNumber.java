package org.example.Array.Program;

import java.util.Arrays;
import java.util.Scanner;

public class SwapIndexNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        System.out.print("Size of Array :: ");
        int val=sc.nextInt();

        int[] arr=new int[val];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the value ["+i+"] index :: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Without swap :: "+Arrays.toString(arr));

        System.out.print("Enter the index number :: ");
        int index1 = sc.nextInt();

        System.out.print("Enter the another index number :: ");
        int index2=sc.nextInt();

        swapIndexValue(arr,index1,index2);
        System.out.println("After swap :: "+Arrays.toString(arr));



    }

    public static void swapIndexValue(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
