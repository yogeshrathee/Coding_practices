package org.example.Practice.CollectionType.ArrayList;
import java.util.*;

public class Sort_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int ele=sc.nextInt();
        List<String> list=new ArrayList<>(ele);
        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }

}
