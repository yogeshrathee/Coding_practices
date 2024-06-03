package org.example.Practice.CollectionType.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();
        List<String> list=new ArrayList<String>(ele);
        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);


    }
}
