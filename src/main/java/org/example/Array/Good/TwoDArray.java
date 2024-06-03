package org.example.Array.Good;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("total rows :: ");
        int row=sc.nextInt();
        System.out.print("total columns :: ");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[row-1].length;j++){
                System.out.print("Enter the ["+i+","+j+"] value :: ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output :: ");
        for(int[] arr1 : arr){
            for(int arr2: arr1){
                System.out.print(arr2+" ");
            }
            System.out.println();
        }

        System.out.println("Size of row :: "+arr.length);
        System.out.println("Size of column :: "+arr[row-1].length);

    }
}