package topic.utilities;

public class Operations {
    /**
     * @param array
     * @param i
     * @param j
     * @return
     */
    public static Integer[] swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;

    }

    /**
     * prints two array
     *
     * @param arr
     */
    public static void printArray(Object[] arr) {
        for (Object i : arr) System.out.print(i + " ");
        System.out.println("");
    }

    /**
     * @param arr
     * @param initialMessage
     */
    public static void printArray(Object[] arr, String initialMessage) {
        System.out.println(initialMessage);
        for (Object i : arr) System.out.print(i + " ");
        System.out.println("");
    }

    /**
     * @param a
     * @param b
     * @return
     */
    public static double maxOf2(double a, double b) {
        return a > b ? a : b;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    public static double minOf2(double a, double b) {
        return a > b ? b : a;
    }

    /**
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double maxOf3(double a, double b, double c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    /**
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double minOf3(double a, double b, double c) {
        return a > b ? (b > c ? c : b) : (a > c ? c : b);
    }

    /**
     *
     * @param array1
     * @param array2
     * @return
     */
    static boolean areArraysEqual(Object[] array1, Object[] array2) {
        if (array1.length != array2.length)
            return false;
        else
            for (int i = 0; i < array1.length; i++)
                if (array1[i] != array2[i])
                    return false;
        return true;
    }
    /**
     *
     * @param arr
     */
    public static void printCharArray(char[] arr){
        for(char c : arr){
            System.out.print(c+" ");
        }
        System.out.println();
    }

    /**
     *
     * @param N
     * @return
     */
    public static int log2(int N)
    {

        // calculate log2 N indirectly
        // using log() method
        int result = (int)(Math.log(N) / Math.log(2));

        return result;
    }

    public static int indexOf(Integer[] arr, int element){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==element)
                return i;
        }
        return -1;
    }
}
