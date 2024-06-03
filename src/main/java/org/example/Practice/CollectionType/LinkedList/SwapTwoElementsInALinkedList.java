package org.example.Practice.CollectionType.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SwapTwoElementsInALinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();
        List<String> list= new LinkedList<>();

        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);

        int firstIndex=sc.nextInt();
        int anotherIndex=sc.nextInt();

        Collections.swap(list,firstIndex,anotherIndex);
        System.out.println(list);


        String firstIndexEle=sc.next();
        String anotherIndexEle=sc.next();

        int start=list.indexOf(firstIndexEle);
        int end=list.indexOf(anotherIndexEle);

        Collections.swap(list,start,end);
        System.out.println(list);
    }
}
