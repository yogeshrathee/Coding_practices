package org.example.Practice.CollectionType.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwapsElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();

        List<String> list1=new ArrayList<>(ele);
        for(int i=0;i<ele;i++){
            list1.add(sc.next());
        }
        System.out.println(list1);
        int firstIndex= sc.nextInt();
        int antherIndex=sc.nextInt();

        Collections.swap(list1,firstIndex,antherIndex);
        System.out.println(list1);

        String firstEle= sc.next();
        String antherEle=sc.next();

        int startIn=list1.indexOf(firstEle);
        int endIn=list1.indexOf(antherEle);

        Collections.swap(list1,startIn,endIn);
        System.out.println(list1);

    }
}
