package sort.insertionsort;

import sort.quicksort.QuickSort;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by alexander on 8/16/16.
 */
public class InsertionTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i =0;i<1000000;++i) {
            arrayList.add(random.nextInt(10000)+10);
        }
        //(new InsertionSort<Integer>(arrayList).sort()).forEach(System.out::println);
        Collections.sort(arrayList);
        arrayList.forEach(System.out::println);
    }
}
