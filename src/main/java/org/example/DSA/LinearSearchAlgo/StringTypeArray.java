package org.example.DSA.LinearSearchAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class StringTypeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String size: ");
        int size = sc.nextInt();

        String[] str=new String[size];
        for(int i=0;i<str.length;i++){
            System.out.print("Enter the "+(i+1)+"th string element: ");
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));


        System.out.print("search element : ");
        String target=sc.next();

        System.out.println(indexSearch(str,target));
    }
    public static int indexSearch(String[] str,String target){
        for(int i=0;i<str.length;i++){
            if(str[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
