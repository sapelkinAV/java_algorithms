package sort.quicksort;

import java.util.ArrayList;

/**
 * Created by alexander on 8/15/16.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(1000-i);
        }
        (new QuickSort<Integer>(arrayList)).quickSort();
    }
}
