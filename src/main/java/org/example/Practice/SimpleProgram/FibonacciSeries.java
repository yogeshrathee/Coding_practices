package org.example.Practice.SimpleProgram;

import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=0)
            System.out.println(0);

        int[] fib=new int[4*num+1];
        fib[0]=0;
        fib[1]=1;

        System.out.println("Fibonacci series up to " + num + ":");
        System.out.print(fib[0] + " " + fib[1] + " "); // Print the first two Fibonacci numbers

        for (int i = 2; i<num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");

        }


        System.out.println();
        int even_index_sum=0;
        int odd_index_sum=0;

        for (int i = 2; i<num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if(i%2==0){
                even_index_sum +=fib[i];
            }
            else {
                odd_index_sum +=fib[i];
            }

        }
        System.out.println("Sum of Even index :: "+even_index_sum);
        System.out.println("Sum of Odd index :: "+odd_index_sum);


        System.out.println();
        System.out.print("Even sum of fibonacci series till number:: ");
        int even_num=sc.nextInt();
        int last_even_index_sum=0;
        for (int i = 2; i<=2*even_num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if(i%2==0){
                last_even_index_sum +=fib[i];
            }

        }
        System.out.println(last_even_index_sum);


        System.out.println();
        System.out.print("Odd sum of fibonacci series till number:: ");
        int odd_num=sc.nextInt();
        int last_odd_index_sum=0;
        for (int i = 2; i<=2*odd_num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if(i%2 !=0){
                last_odd_index_sum +=fib[i];
            }

        }
        System.out.println(last_odd_index_sum);



    }
}