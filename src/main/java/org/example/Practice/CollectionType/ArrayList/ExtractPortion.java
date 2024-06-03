package org.example.Practice.CollectionType.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractPortion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();
        List<String> list=new ArrayList<>(ele);
        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);
        int startIndex=sc.nextInt();
        int endIndex=sc.nextInt();

        List<String> extractList1=list.subList(startIndex,endIndex);
        System.out.println(extractList1);

        String startEle=sc.next();
        String endEle=sc.next();

        int startIn=list.indexOf(startEle);
        int endIn=list.indexOf(endEle);

        List<String> extractList2=list.subList(startIn,endIn);
        System.out.println(extractList2);

    }
}
