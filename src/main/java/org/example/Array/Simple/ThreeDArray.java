package org.example.Array.Simple;

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
        for(int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                for (int k=0;k<z;k++) {
                    System.out.print("Enter the [" + i + "," + j + ","+ k +"] value :: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Output :: ");
        for(int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                for (int k=0;k<z;k++) {
                System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Size of x :: "+arr.length);
        System.out.println("Size of y :: "+arr[0].length);
        System.out.println("Size of z :: "+arr[0][0].length);

    }
}
