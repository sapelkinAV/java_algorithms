package sort.insertionsort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by alexander on 8/16/16.
 */
public class InsertionSort<T extends Comparable<T>> {
    private ArrayList<T> array;

    public InsertionSort(ArrayList<T> array) {
        this.array = array;
    }

    public ArrayList<T> sort(){
        if (array.size() <= 1) {
            return array;
        }
        T key;
        for(int j = 1; j < array.size();j++) {
            key = array.get(j);
            int i = j - 1;
            while ((i > -1) && (array.get(i).compareTo(key) < 0)) {
                array.set(i + 1, array.get(i));
                i--;
            }
            array.set(i + 1, key);
        }

        return array;
    }

    ArrayList<T> insertionSort(ArrayList<T> arrayToSort) {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }
        for (int j = 1; j < arrayToSort.size(); j++) {
            T key = arrayToSort.get(j);
            int i = j - 1;
            while ((i > 0) && (arrayToSort.get(i).compareTo(key) > 0)) {
                arrayToSort.set(i + 1, arrayToSort.get(i));
                i--;
            }
            arrayToSort.set(i,key);
        }

        return null;
    }


}
