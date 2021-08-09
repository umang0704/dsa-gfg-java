package topic.sorting;

import topic.utilities.*;

import java.util.Collection;
import java.util.Collections;

public class BubbleSort {
    static void bubble_sort(Integer[] array) {
        Integer[] arr = array;
        Operations.printArray(arr);
        int n = arr.length;
        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        Operations.printArray(arr);
    }

    public static void main(String[] args) {
        bubble_sort(GetValue.getIntArray());
    }
}
