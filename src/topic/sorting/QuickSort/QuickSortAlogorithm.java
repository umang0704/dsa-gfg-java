package topic.sorting.QuickSort;

import topic.utilities.GetValue;
import topic.utilities.Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSortAlogorithm {
    /**
     *
     * @param array
     * @param low
     * @param high
     * @return
     */
    public static Integer[] qS_h(Integer[] array, int low, int high) {
        if (low < high) {
            int randomPiv = new Random().nextInt(high - low + 1) + low;
            array = Operations.swap(array, low, randomPiv);
            List l = PartitionFunction.hoares_partition(array, low, high);
            array = (Integer[]) l.get(0);
            int piv = (int) l.get(1);
            array = qS_h(array, low, piv);
            array = qS_h(array, piv + 1, high);
        }
        return array;
    }

    /**
     *
     * @param array
     * @param low
     * @param high
     * @return
     */
    public static Integer[] qS_l(Integer[] array, int low, int high) {
        if (low < high) {
            int randomPiv = new Random().nextInt(high - low + 1) + low;
            array = Operations.swap(array, high, randomPiv);
            List l = PartitionFunction.lomuto_partition(array, low, high);
            array = (Integer[]) l.get(0);
            int piv = (int) l.get(1);
            array = qS_h(array, low, piv-1);
            array = qS_h(array, piv + 1, high);
        }
        return array;
    }
    public static void main(String[] args) {
        Integer[] array =  GetValue.getIntArray();
        System.out.println(List.of(array));
        array = qS_l(array,0,array.length-1);
        System.out.println(List.of(array));
    }
}
/*
8
5   3   8   4   2   7   1   10
 */