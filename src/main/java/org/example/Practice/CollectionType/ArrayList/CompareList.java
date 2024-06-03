package org.example.Practice.CollectionType.ArrayList;
import java.util.*;
public class CompareList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();

        List<String> list1=new ArrayList<>(ele);
        for(int i=0;i<ele;i++){
            list1.add(sc.next());
        }
        System.out.println(list1);


        List<String> list2=new ArrayList<>(ele);
        for(int i=0;i<ele;i++){
            list2.add(sc.next());
        }
        System.out.println(list2);

        List<String> list3=new ArrayList<>(ele);
        for(String e : list1){
            list3.add(list2.contains(e) ? "Yes" : "No");
        }
        System.out.println(list3);
    }
}
