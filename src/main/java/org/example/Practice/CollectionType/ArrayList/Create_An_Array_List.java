package org.example.Practice.CollectionType.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Create_An_Array_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;

        int size=sc.nextInt();
        ArrayList<String> arr=new ArrayList<>(size);
        for(int i=0;i<size;i++){
            arr.add(sc.next());
        }
        System.out.println(arr);
    }
}
