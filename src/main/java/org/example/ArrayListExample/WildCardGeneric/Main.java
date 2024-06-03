package org.example.ArrayListExample.WildCardGeneric;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of List: ");
        int size=sc.nextInt();

//create wildCard type generic and call one time for print the different-different type List
        List<?> list=new ArrayList<>(size);
        Type.listType(list,size);

    }
}
