package org.example.Practice.CollectionType.LinkedList;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JoinTwoLinkedLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();

        List<String> list=new LinkedList<>();
        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);

        List<String> list1=new LinkedList<>();
        for(int i=0;i<ele;i++){
            list1.add(sc.next());
        }
        System.out.println(list1);

        List<String> list2 = new LinkedList<>();
        list2.addAll(list);
        list2.addAll(list1);

        System.out.println(list2);




    }
}
