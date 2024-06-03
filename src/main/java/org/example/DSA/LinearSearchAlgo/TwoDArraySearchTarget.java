package org.example.DSA.LinearSearchAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraySearchTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("size of row:: ");
        int row=sc.nextInt();
        System.out.print("size of column:: ");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] arr1:arr){
            System.out.println(Arrays.toString(arr1));
        }

        System.out.print("Target value :: ");
        int target=sc.nextInt();

        System.out.println(Arrays.toString(indexSearch(arr, target)));
    }

    public static int[] indexSearch(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
