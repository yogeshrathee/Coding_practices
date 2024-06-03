package org.example.ArrayListExample.WildCardGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Type {
    public static void listType(List<?> list,int size) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list1=new ArrayList<>(size);
        System.out.print("Integer type value :: ");
        for(int i=0;i<size;i++){
            list1.add(sc.nextInt());
        }
        List<String> list2=new ArrayList<>(size);
        System.out.print("String type value :: ");
        for(int i=0;i<size;i++){
            list2.add(sc.next());
        }
        System.out.println();
        System.out.println("Print Integer type value :: "+list1);
        System.out.println("Print String type value :: "+list2);

    }
}
