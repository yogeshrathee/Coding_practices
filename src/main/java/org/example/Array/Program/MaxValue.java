package org.example.Array.Program;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        int val=sc.nextInt();
        int[] arr=new int[val];
        for(int i=0;i<val;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));


    }
    public static int max(int[] arr){
        int maxValue=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
