package org.example.ArrayListExample.Swap;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapIndexNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("size of array :: ");
        int size=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(size);

        for(int i=0;i<size;i++) {
            System.out.print("Enter the " + (i + 1) + " index value :: ");
            list.add(sc.nextInt());
        }
        System.out.println("Without swap :: ");
        System.out.println(list);

        System.out.println();

        System.out.print("index number :: ");
        int index1=sc.nextInt();

        System.out.print("Another index number :: ");
        int index2=sc.nextInt();

        IndexNumber.swapIndex(list,index1,index2);

        System.out.println("After Swapping :: ");
        System.out.println(list);
    }

}
