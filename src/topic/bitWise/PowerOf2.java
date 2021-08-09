package topic.bitWise;

import topic.utilities.GetValue;

public class PowerOf2 {
    //naive
    public static boolean isPow2_i(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;
        }
        return true;
    }

    //efficient
    public static boolean isPow2_ii(int n) {
        return (n != 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        int n = GetValue.scanInt("Enter number:");
        System.out.println(isPow2_i(n));
        System.out.println(isPow2_ii(n));
    }
}
