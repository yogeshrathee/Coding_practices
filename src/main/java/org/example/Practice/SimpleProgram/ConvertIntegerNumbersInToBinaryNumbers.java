package org.example.Practice.SimpleProgram;

import java.util.Scanner;

public class ConvertIntegerNumbersInToBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] binNum=new int[num];

        int bNum=0;
        while(num>0){
            binNum[bNum]=num%2;
            num /=2;
            bNum++;
        }
        for(int j=bNum-1;j>=0;j--){
            System.out.print(binNum[j]);
        }
    }
}
