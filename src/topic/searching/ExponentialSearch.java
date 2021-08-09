package topic.searching;

import topic.utilities.GetValue;

import java.util.Arrays;

public class ExponentialSearch {
    /**
     *
     * @param arr
     * @param x
     * @return
     */
    static int eSearch(Integer[] arr, int x){
        int arraySize = arr.length;
        if(arr[0] == x)
            return 0;
        int i =1;
        while(i<arraySize && arr[i]<=x)
            i*=2;
        return Arrays.binarySearch(arr,i/2,Math.min(i,arraySize-1),x);
    }

    public static void main(String[] args) {
        Integer[] arr = GetValue.getIntArray();
        int getElement = GetValue.scanInt("Enter number to be searched.");
        System.out.println(eSearch(arr,getElement));
    }
}
