package org.example.Practice.CollectionType.ArrayList;

import java.util.*;

public class DuplicateElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int elementSize=sc.nextInt();

        List<Integer> list = new ArrayList<>(elementSize);

        for(int i=0;i<elementSize;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);

        List<Integer> list1=new ArrayList<>(set);
        Collections.reverse(list1);
        System.out.println(list1);


        // first duplicate element
        List<Integer> list2 =new ArrayList<>();
        Integer firstDuplicate = null;
        for(Integer firstNum: list){
            if(list2.contains(firstNum)){
                firstDuplicate = firstNum;
                break;
            }
            list2.add(firstNum);
        }

        if(firstDuplicate !=null){
            System.out.println(firstDuplicate);
        }else{
            System.out.println("not found");
        }

        //second  duplicate element
        List<Integer> list3 = new ArrayList<>();
        Integer Duplicate = null;
        int duplicateCount=0;
        for(Integer num : list){
            if(list3.contains(num)) {
                duplicateCount++;
                if (duplicateCount == 2) {
                    Duplicate = num;
                    break;
                }
            }
            list3.add(num);
        }
        if(Duplicate !=null){
            System.out.println(Duplicate);
        }
        else{
            System.out.println("not found any duplicate");
        }

        //last duplicate element
        List<Integer> list4=new ArrayList<>();
        Integer lastDuplicate = null;
        for(Integer lastNum : list){
            if(list4.contains(lastNum)){
                lastDuplicate = lastNum;
                continue;
            }
            list4.add(lastNum);
        }
        if(lastDuplicate !=null){
            System.out.println(lastDuplicate);
        }
        else{
            System.out.println("not found");
        }


    }
}