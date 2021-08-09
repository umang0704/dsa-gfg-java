package topic.sorting;

import topic.utilities.GetValue;
import topic.utilities.Operations;

public class MergeSort {
    /**
     *
     * @param array
     * @param leftIndex
     * @param mid
     * @param rightIndex
     * @return
     */
    public static Integer[] mergeSortedArrays(Integer[] array, int leftIndex, int mid, int rightIndex) {
        //create left and right array using the mid
        int sizeRight = rightIndex - mid, sizeLeft = mid - leftIndex + 1;
        Integer[] left = new Integer[sizeLeft];
        Integer[] right = new Integer[sizeRight];

        //copy left part in left array
        for (int i = 0; i < sizeLeft; i++)
            left[i] = array[leftIndex + i];

        //copy right part in right array
        for (int i = 0; i < sizeRight; i++)
            right[i] = array[mid + i + 1];


        //add the elements from right and left
        //according to increasing order in original array
        int i = 0, j = 0, k = leftIndex;
        while (i < sizeLeft && j < sizeRight)
            if (left[i] <= right[j])
                array[k++] = left[i++];
            else
                array[k++] = right[j++];
        while (i < sizeLeft)
            array[k++] = left[i++];
        while (j < sizeRight)
            array[k++] = right[j++];
        Operations.printArray(array);
        return array;
    }

    /**
     *
     * @param array
     * @param leftIndex
     * @param rightIndex
     * @return
     */
    public static Integer[] mergeSort(Integer[] array, int leftIndex, int rightIndex) {
        if (rightIndex > leftIndex) {
            int mid = (leftIndex + (rightIndex - leftIndex) / 2);
            array = mergeSort(array, leftIndex, mid);
            array = mergeSort(array, mid + 1, rightIndex);
            array = mergeSortedArrays(array, leftIndex, mid, rightIndex);
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = GetValue.getIntArray();
        Operations.printArray(array, "Initial Array:");

        array = mergeSort(array, 0, array.length - 1);

        Operations.printArray(array, "Final Array:");

    }
}
