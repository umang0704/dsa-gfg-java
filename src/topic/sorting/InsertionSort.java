package topic.sorting;

import topic.utilities.GetValue;
import topic.utilities.Operations;

public class InsertionSort {
    public static void insertionSort(Integer[] arr) {
        Operations.printArray(arr);
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        Operations.printArray(arr);
    }

    public static void main(String[] args) {
        insertionSort(GetValue.getIntArray());
    }
}
