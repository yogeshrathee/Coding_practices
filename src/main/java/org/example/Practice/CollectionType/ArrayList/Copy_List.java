package org.example.Practice.CollectionType.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Copy_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();

        List<String> list1=new ArrayList<>(ele);
        for(int i=0;i<ele;i++){
            list1.add(sc.next());
        }
        System.out.println("List1 :: "+list1);

        List<String> list2=new ArrayList<>(ele);
        for(int i=0;i<ele;i++){
            list2.add(sc.next());
        }
        System.out.println("List2 :: "+list2);
        System.out.println();

        System.out.println("Copy List ->");
        Collections.copy(list1,list2);
        System.out.println("\s\sList1 :: "+list1);
        System.out.println("\s\sList2 :: "+list2);



    }
}
