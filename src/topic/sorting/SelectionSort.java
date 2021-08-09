package topic.sorting;

import topic.utilities.GetValue;
import topic.utilities.Operations;

public class SelectionSort {
    public static void SelSort(Integer[] arr){
        Operations.printArray(arr);
        for(int i = 0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])
                    minIndex = j;
            }
            arr = Operations.swap(arr,minIndex,i);
            //Operations.printArray(arr);
        }
        Operations.printArray(arr);
    }

    public static void main(String[] args) {
        SelSort(GetValue.getIntArray());
    }
}
