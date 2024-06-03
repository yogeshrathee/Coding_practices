package org.example.Practice.CollectionType.ArrayList;
import java.util.*;

public class Search_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();
        List<String> list=new ArrayList<>(ele);
        for(int i=0;i<ele;i++){
            list.add(sc.next());
        }
        System.out.println(list);
        System.out.print("Enter the index number for search element:: ");
        int searchIndex=sc.nextInt();
        System.out.println(list.get(searchIndex));
        System.out.print("Search the element by the value ::");
        String searchByValue=sc.next();
        System.out.println(list.indexOf(searchByValue));

        if(list.contains(searchByValue)){
            System.out.println(list.indexOf(searchByValue));
        }else{
            System.out.println("not found");
        }

    }
}
