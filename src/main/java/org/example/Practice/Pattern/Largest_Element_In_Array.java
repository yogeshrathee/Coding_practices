package org.example.Practice.Pattern;

import java.util.Scanner;

public class Largest_Element_In_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();

        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum:: "+max);

        int min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum:: "+min);
    }
}
