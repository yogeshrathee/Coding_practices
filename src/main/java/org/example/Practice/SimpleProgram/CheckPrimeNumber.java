package org.example.Practice.SimpleProgram;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=2;i<num;i++){
            if(num % i == 0){
                flag = 0;
                break;
            }
            else{
                flag=1;
            }
        }
        if(flag == 1){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }
}