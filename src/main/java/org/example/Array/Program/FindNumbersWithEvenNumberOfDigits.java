package org.example.Array.Program;


//leetcode questions number 1295

import java.util.Arrays;
import java.util.Scanner;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        FindNumbersWithEvenNumberOfDigits obj=new FindNumbersWithEvenNumberOfDigits();
        int[] result = obj.findNumber(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] findNumber(int[] nums){
        int evenCount=0,oddCount=0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int digit=0;
            while(num!=0){
                num /=10;
                digit++;
            }
            if(digit % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        return new int[]{evenCount,oddCount};
    }
}
