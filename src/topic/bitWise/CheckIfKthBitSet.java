package topic.bitWise;

import topic.utilities.GetValue;

public class CheckIfKthBitSet {
    public static void rightShift(int n, int k) {
        if (((n >> (k - 1)) & 1) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void usingLeftShift(int n, int k) {
        if ((n & (1 << (k - 1))) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean checkKthBit(int n, int k) {
        // Your code here
        return ((n & (1 << k)) != 0);
    }

    public static void main(String[] args) {
        int n = GetValue.scanInt("Enter number:");
        int k = GetValue.scanInt("Enter position:");
        rightShift(n, k);
        usingLeftShift(n, k);
    }
}
