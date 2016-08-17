package sort.mergesort;

import java.util.ArrayList;

/**
 * Created by alexander on 8/16/16.
 */
public class MergeSort {
    private int[] numbers;
    private int[] helper;

    private int number;

    private static <T extends Comparable<T>> ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right) {
        ArrayList<T> result = new ArrayList<T>();
        while ((!left.isEmpty()) && (!right.isEmpty())) {
            if (left.get(0).compareTo(right.get(0)) > 0) {
                result.add(right.remove(0));
            }else{
                result.add(left.remove(0));
            }
        }
        while (!left.isEmpty()) {
            result.add(left.remove(0));
        }
        while (!right.isEmpty()) {
            result.add(right.remove(0));
        }

        return result;

    }

    public static  <T extends Comparable<T>> ArrayList<T> mergeSort(ArrayList<T> arrayList) {
        if (arrayList.size() > 1){
            ArrayList<T> left = mergeSort(new ArrayList<T>(arrayList.subList(0, arrayList.size() / 2)));
            ArrayList<T> right = mergeSort(new ArrayList<T>(arrayList.subList((arrayList.size() / 2), arrayList.size())));
            return merge(left, right);
        }
        return arrayList;

    }





}
