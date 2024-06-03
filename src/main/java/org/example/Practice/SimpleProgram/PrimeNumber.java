package org.example.Practice.SimpleProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int startElement=sc.nextInt();
        int lastElement=sc.nextInt();

        List<Integer> list=new ArrayList<>();

        for(int i=startElement;i<lastElement;i++){
            for(int j=2;j<i;j++){
                if(i % j == 0){
                    flag = 0;
                    break;
                }else{
                    flag = 1;
                }
            }
            if(flag == 1){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}