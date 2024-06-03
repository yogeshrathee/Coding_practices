package org.example.DSA.LinearSearchAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("size of array :: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the "+(i+1)+"th element :: ");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the element :: ");
        int find_value=sc.nextInt();

        System.out.println(indexNumber(arr,find_value));

    }
    public static int indexNumber(int[] arr, int find_value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find_value){
                return i;
            }
        }
        return -1;
    }
}
