package org.example.Array.Good;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("total X :: ");
        int x=sc.nextInt();
        System.out.print("total Y :: ");
        int y=sc.nextInt();
        System.out.print("total Z :: ");
        int z=sc.nextInt();


        int[][][] arr=new int[x][y][z];
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[x-1].length;j++){
                for (int k=0;k<arr[x-1][y-1].length;k++) {
                    System.out.print("Enter the [" + i + "," + j + ","+ k +"] value :: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Output :: ");
        for(int[][] arr1 : arr){
            for(int[] arr2 : arr1){
                for(int arr3 : arr2){
                    System.out.print(arr3+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Size of x :: "+arr.length);
        System.out.println("Size of y :: "+arr[x-1].length);
        System.out.println("Size of z :: "+arr[x-1][y-1].length);

    }
}
