package topic.searching;

import topic.utilities.GetValue;

public class JSearch {
    static int jSearch(Integer[] a, int x) {
        int size = a.length;

        //creating the block of sqrt(n) size
        int blockRef = (int) Math.floor(Math.sqrt(size));

        //reference to the last index of previous block
        int prevBlockEndRef = 0;

        //searching the required block, else return -1
        while (a[Math.min(blockRef, size) - 1] < x) {
            prevBlockEndRef = blockRef;
            blockRef += (int) Math.sqrt(size);
            if (prevBlockEndRef >= size)
                return -1;
        }

        //linear search the element
        while (a[prevBlockEndRef] < x) {
            prevBlockEndRef++;
            if (prevBlockEndRef == Math.min(blockRef, size))
                return -1;
        }

        //check if the reached index is our element or not
        if (a[prevBlockEndRef] == x)
            return prevBlockEndRef;

        //if not return -1
        return -1;

    }

    public static void main(String[] args) {
        Integer[] arr = GetValue.getIntArray();
        int getElement = GetValue.scanInt("Enter number to be searched.");
        System.out.println(jSearch(arr,getElement));
    }
}
