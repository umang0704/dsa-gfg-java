package topic.bitWise;

import topic.utilities.GetValue;

public class OddOccurringNumber {
    public static void naive(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void usingXor(Integer[] arr){
        int res = 0;
        for(int i = 0 ; i<arr.length;i++){
            res = res^arr[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Integer[] array = GetValue.getIntArray("Enter array with on one number occurring odd number of times:");
        naive(array);
        usingXor(array);

    }
}
/*
5
3	3	4	5	5
 */