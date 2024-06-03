package org.example.Practice.SimpleProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//A perfect number in Java is a positive integer that is equal to the sum of its proper
// positive divisors excluding the number itself. For example, the divisors of
// 6 are 1, 2 and 3. The sum of the proper divisors of 6 is 1 + 2 + 3 = 6, which is a
// perfect number. The sum of the proper divisors of 28 is 1 + 2 + 4 + 7 + 14 = 28,
// which is also a perfect number.
public class PerfectNumber{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int num=sc.nextInt();
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum +=i;
                list.add(i);
            }

        }
        System.out.print(list+" = "+sum);
        System.out.println();
        if(sum==num){
            System.out.print("(num) "+num+" = "+sum+" (sum)");
        }else{
            System.out.print("(num) "+num+" != "+sum+" (sum)");
        }
        if(sum == num){
            System.out.println("    'Perfect number'");
        }else{
            System.out.println("    'Not perfect number'");
        }

    }
}