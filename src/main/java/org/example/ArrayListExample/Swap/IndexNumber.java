package org.example.ArrayListExample.Swap;

import java.util.ArrayList;
import java.util.Collections;

public class IndexNumber {
    public static void swapIndex(ArrayList<Integer>list ,int index1 ,int index2){

//        int temp = list.get(index1);
//        list.set(index1,list.get(index2));
//        list.set(index2,temp);

        Collections.swap(list,index1,index2);
    }
}
