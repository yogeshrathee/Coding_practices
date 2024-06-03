package org.example.Practice.SimpleProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[][] arr=new int[size][size];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int[] arr1 : arr){
            System.out.println(Arrays.toString(arr1));
        }

        int[][] transpose=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                transpose[i][j]=arr[j][i];
            }
        }

        System.out.println();
        for(int[] arr3 : transpose){
            System.out.println(Arrays.toString(arr3));
        }

    }
}
