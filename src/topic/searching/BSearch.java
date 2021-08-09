package topic.searching;

import topic.utilities.GetValue;

import java.util.Arrays;

public class BSearch {
    //iterative

    /**
     * @param arr
     * @param x
     * @return
     */
    static int iterativeSearch(Integer[] arr, int x) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    //recursive

    /**
     * @param arr
     * @param l
     * @param r
     * @param x
     * @return
     */
    static int recursiveBSearch(Integer[] arr, int l, int r, int x) {
        Arrays.sort(arr);
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                return recursiveBSearch(arr, mid + 1, r, x);
            else
                return recursiveBSearch(arr, l, mid - 1, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = GetValue.getIntArray();
        int getElement = GetValue.scanInt("Enter number to be searched.");
        System.out.println(iterativeSearch(arr,getElement));
        System.out.println(recursiveBSearch(arr,0,arr.length-1,getElement));
    }
}
