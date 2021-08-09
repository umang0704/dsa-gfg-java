package topic.bitWise.questions;

public class BitDifference {
    static int CountBits(int k) {
        int res = 0;
        while (k > 0) {
            res++;
            k &= k - 1;
        }
        return res;
    }

    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b) {
        // Your code here
        return CountBits(a ^ b);
    }

}
