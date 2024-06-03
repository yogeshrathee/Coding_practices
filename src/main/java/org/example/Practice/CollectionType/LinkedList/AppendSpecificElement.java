package org.example.Practice.CollectionType.LinkedList;
import java.util.*;

public class AppendSpecificElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();

        List<String> list=new LinkedList<>();
        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);

    }
}
