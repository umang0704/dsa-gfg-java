package topic.sorting;

import topic.utilities.GetValue;
import topic.utilities.Operations;

public class HeapSort {
    /**
     * @param array
     * @param size
     * @param indexParentNode
     * @return
     */
    public static Integer[] maxHeapify(Integer[] array, int size, int indexParentNode) {
        int largest = indexParentNode, left = 2 * indexParentNode + 1, right = 2 * indexParentNode + 2;
        if (left < size && array[left] > array[largest])
            largest = left;
        if (right < size && array[right] > array[largest])
            largest = right;
        if (largest != indexParentNode) {
            array = Operations.swap(array, largest, indexParentNode);
            array = maxHeapify(array, size, largest);
        }
        return array;
    }

    /**
     *
     * @param array
     * @param size
     * @return
     */
    public static Integer[] buildHeap(Integer[] array,int size){
        for(int i = (size-2)/2 ; i >= 0;i--)
            array = maxHeapify(array,size,i);
        return array;
    }

    /**
     *
     * @param array
     * @param arraySize
     * @return
     */
    public static Integer[] heapSort(Integer[] array , int arraySize){
        array = buildHeap(array,array.length);
        for(int i = arraySize-1;i>=1;i--){
            array = Operations.swap(array,0,i);
            array = maxHeapify(array,i,0);
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = GetValue.getIntArray();
        Operations.printArray(array);
//        array = buildHeap(array,array.length);
        array = heapSort(array,array.length);
        Operations.printArray(array);
    }
}
/*
5
10	15	50	4	20
 */