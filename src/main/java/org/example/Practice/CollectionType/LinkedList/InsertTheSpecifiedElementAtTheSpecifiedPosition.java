package org.example.Practice.CollectionType.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InsertTheSpecifiedElementAtTheSpecifiedPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();

        List<String> list=new LinkedList<>();
        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);

        int pos=sc.nextInt();
        String val=sc.next();
        list.add(pos,val);
        System.out.println(list);
    }
}
