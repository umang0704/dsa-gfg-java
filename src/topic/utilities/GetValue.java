package topic.utilities;

import java.util.Scanner;

public class GetValue {
    private static Scanner sc = null;

    /**
     * @return
     */
    public synchronized static int scanInt(String str) {
        sc = new Scanner(System.in);
        System.out.println(str);
        int n = 0;
        if (!sc.hasNext())
            sc.close();
        else
            n = sc.nextInt();
        return n;
    }

    /**
     * @return
     */
    public synchronized static double scanDouble(String str) {
        sc = new Scanner(System.in);
        System.out.println(str);
        double n = 0.0;
        sc.next();
        if (!sc.hasNext())
            sc.close();
        else
            n = sc.nextDouble();
        return n;
    }

    /**
     * @return
     */
    public synchronized static String scanString(String str) {

        sc = new Scanner(System.in);
        System.out.println(str);
        String ret = "";
        if (!sc.hasNext())
            sc.close();
        else
            ret = sc.nextLine();
        return ret;


    }

    /**
     * @return
     */
    public static Integer[] getIntArray() {
        System.out.println("Enter size of an Array:");
        sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            if (!sc.hasNext())
                sc.close();
            else
                arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static Integer[] getIntArray(String message) {
        System.out.println(message);
        System.out.println("Enter size of an Array:");
        sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            if (!sc.hasNext())
                sc.close();
            else
                arr[i] = sc.nextInt();
        }
        return arr;
    }


}
