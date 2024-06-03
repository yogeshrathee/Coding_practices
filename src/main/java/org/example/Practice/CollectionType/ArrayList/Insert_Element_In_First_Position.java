package org.example.Practice.CollectionType.ArrayList;
import java.util.*;

public class Insert_Element_In_First_Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        List<String> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(sc.next());
        }
        System.out.println(list);

        list.addFirst(sc.next());
        System.out.println(list);
    }
}
