package org.example.Practice.CollectionType.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Retrieve_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int size=sc.nextInt();

        List<String> list=new ArrayList<>(size);
        for(int i=0;i<size;i++){
            list.add(sc.next());
        }
        System.out.println(list);


        System.out.println(list.get(sc.nextInt()));
    }
}
