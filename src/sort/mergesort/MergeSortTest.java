package sort.mergesort;

import datastructures.StructureGenerator;

import java.util.ArrayList;

/**
 * Created by alexander on 8/17/16.
 */
public class MergeSortTest {
    public static void main(String[] args) {
        ArrayList<Integer> testArray = StructureGenerator.getGenArray(10, 0, 10000);
        testArray.forEach(System.out::println);
        System.out.println("===============================");
        testArray = MergeSort.mergeSort(testArray);
        testArray.forEach(System.out::println);
    }
}
