package org.example.Practice.CollectionType.ArrayList;
import java.util.*;
public class Update_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        List<String> list=new ArrayList<>(size);
        for(int i=0;i<size;i++){
            list.add(sc.next());
        }
        System.out.println(list);

        list.set(sc.nextInt(),sc.next());
        System.out.println(list);
    }
}
