package topic.sorting.QuickSort;

import topic.utilities.GetValue;
import topic.utilities.Operations;

import java.util.ArrayList;
import java.util.List;

public class PartitionFunction {
    /**
     * @param array
     * @param low
     * @param high
     * @return
     */
    public static List lomuto_partition(Integer[] array, int low, int high) {

        //always last elements
        int p = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= p) {
                i++;
                array = Operations.swap(array, i, j);
            }
            //System.out.println(List.of(array));n
        }
        array = Operations.swap(array, i + 1, high);

        return List.of(array, (i + 1));
    }

    /**
     *
     * @param array
     * @param low
     * @param high
     * @return
     */
    public static List hoares_partition(Integer[] array, int low, int high) {
        int p = array[low];
        int i = low - 1, j = high + 1;
        while (true) {
            do {
                i++;
            } while (array[i] < p);
            do {
                j--;
            } while (array[j] > p);
            if (i >= j) return List.of(array, j);
            array = Operations.swap(array, i, j);
        }
    }

    /**
     *
     * @param array
     * @param low
     * @param high
     * @param pivot_index
     * @return
     */
    public static List naive_partition(Integer[] array,int low,int high,int pivot_index){
        Integer[] temp = new Integer[high-low+1];
        int index = 0;
        for(int i = low;i<=high;i++){
            if(array[i]<=array[pivot_index]){
                temp[index++]=array[i];
            }
        }
        for(int i = low;i<=high;i++){
            if(array[i]>=array[pivot_index]){
                temp[index++]=array[i];
            }
        }
        for(int i = low;i<=high;i++){
            array[i] = temp[i-low];
        }
        return List.of(array,pivot_index);
    }

    public static void main(String[] args) {
        Integer[] arr = GetValue.getIntArray();
        List l1 = hoares_partition(arr, 0, arr.length - 1);
//        List l = lomuto_partition(arr, 0, arr.length - 1);
//        System.out.println(List.of((Integer[]) l.get(0)) + " -piv:" + l.get(1));
        System.out.println(List.of((Integer[]) l1.get(0)) + " -piv:" + l1.get(1));
    }
}
/*

7
10	80	30	90	40	50	70

8
5   3   8   4   2   7   1   10

 */