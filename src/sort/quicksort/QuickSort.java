package sort.quicksort;
import java.util.ArrayList;

/**
 * Created by alexander on 8/15/16.
 */
public class QuickSort<T extends Comparable<T>> {
    ArrayList<T> arrayToSort = null;

    public QuickSort(ArrayList<T> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public void quickSort() {
        arrayToSort.forEach(System.out::println);
    }
}
