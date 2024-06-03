package org.example.Array.Program;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        int val=sc.nextInt();
        int[] arr=new int[val];
        for(int i=0;i<val;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        reverse(arr);
    }
    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
