package org.example.Practice.CollectionType.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        int match=sc.nextInt();
        List<Integer>list2 = new ArrayList<>();
        for(int i=0;i<match;i++){
            list2.add(sc.nextInt());
        }
        System.out.println(list2);

        List<Integer> equalsNumber=new ArrayList<>(size);
        List<Integer> notEqualsNumber=new ArrayList<>(size);
        List<Integer> notContainedInFirstList = new ArrayList<>();

       for(Integer num : list){
           if(list2.contains(num)){
               equalsNumber.add(num);
           }else{
               notEqualsNumber.add(num);
           }
        }
       for(Integer num1: list2){
           if(!list.contains(num1)){
               notContainedInFirstList.add(num1);
           }
       }

        System.out.println("Equals :: "+ Arrays.toString(equalsNumber.toArray()));
        System.out.println("Not Equals :: "+Arrays.toString(notEqualsNumber.toArray()));
        System.out.println("Not Exist Inside the list :: " + Arrays.toString(notContainedInFirstList.toArray()));

    }
}
