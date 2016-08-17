package datastructures;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alexander on 8/17/16.
 */
public class StructureGenerator {
    public static ArrayList<Integer> getGenArray(int size, int minValue, int maxValue) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i =0;i<size;++i) {
            arrayList.add(random.nextInt(maxValue)+minValue);
        }
        return arrayList;
    }
}
