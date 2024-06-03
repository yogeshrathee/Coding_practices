package org.example.Array.Program;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        int val=sc.nextInt();
        int[] arr=new int[val];
        for(int i=0;i<val;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int start=sc.nextInt();
        int end=sc.nextInt();

        System.out.println(maxRange(arr,start,end));
    }
    public static int maxRange(int[] arr,int start, int end){
        int maxValue=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }

        return maxValue;
    }
}
