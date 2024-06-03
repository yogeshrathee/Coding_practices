package org.example.ArrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of val:");
        int val = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(val);

        for (int i = 0; i < val; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println("Enter " + val + "x" + val + " matrix:");
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);

        System.out.println("Matrix stored in ArrayList:");
        for (ArrayList<Integer> list1 : list) {
            System.out.println(Arrays.toString(list1.toArray()));
        }

        System.out.println("Size of the ArrayList: " + list.size());

    }
}
