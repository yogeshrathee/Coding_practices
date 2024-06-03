package org.example.Array.Simple;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("total rows :: ");
        int row=sc.nextInt();
        System.out.print("total columns :: ");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("Enter the ["+i+","+j+"] value :: ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output :: ");
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Size of row :: "+arr.length);
        System.out.println("Size of column :: "+arr[0].length);

    }
}
