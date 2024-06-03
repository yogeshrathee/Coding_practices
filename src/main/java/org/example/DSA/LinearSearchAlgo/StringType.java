package org.example.DSA.LinearSearchAlgo;
import java.util.*;

public class StringType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        System.out.print("Enter target letter to search: ");
        char ch=sc.next().charAt(0);

        System.out.println(search(str,ch));
    }
    public static boolean search(String str, char ch) {
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==ch) {
                return true;
            }
        }
        return false;
    }
}
