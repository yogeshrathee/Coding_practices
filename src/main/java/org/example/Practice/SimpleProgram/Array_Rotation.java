package org.example.Practice.SimpleProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int d=sc.nextInt();
        rotate(arr,d);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotate(int[] arr,int d){
        int n=arr.length;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }
    public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];;
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
