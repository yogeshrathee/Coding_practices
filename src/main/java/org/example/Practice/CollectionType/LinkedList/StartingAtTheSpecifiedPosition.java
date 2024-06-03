package org.example.Practice.CollectionType.LinkedList;

import java.util.*;
public class StartingAtTheSpecifiedPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();

        List<String> list=new LinkedList<>();
        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);

        int pos=sc.nextInt();
        Iterator<String> p=list.listIterator(pos);
        while(p.hasNext()){
            System.out.print(Collections.singletonList(p.next())+" ");
        }

        System.out.println();
        List<String>list1=list.subList(pos,list.size());
        System.out.println(list1);
    }
}
