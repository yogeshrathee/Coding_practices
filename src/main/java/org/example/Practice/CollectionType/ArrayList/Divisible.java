package org.example.Practice.CollectionType.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Divisible{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();


        List<Integer> list=new ArrayList<>(size);
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        int div=sc.nextInt();

        List<Integer> divisible = new ArrayList<>(size);
        List<Integer> notDivisible = new ArrayList<>(size);

        for(Integer num : list){
            if(num % div == 0){
                divisible.add(num);
            }
            else {
                notDivisible.add(num);
            }
        }
        System.out.println("Divisible by "+div+" :: "+Arrays.toString(divisible.toArray()));
        System.out.println("Not Divisible by "+div+" :: "+Arrays.toString(notDivisible.toArray()));

    }
}