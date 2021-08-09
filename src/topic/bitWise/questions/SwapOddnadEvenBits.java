package topic.bitWise.questions;

import topic.utilities.GetValue;

public class SwapOddnadEvenBits {
    public static int swapBits(int n) {
        int altEven = n & 0xAAAAAAAA;
        int altOdd = n & 0x55555555;
        System.out.println(Integer.toBinaryString(n)+"\n"+Integer.toBinaryString(altEven)+"\n"+Integer.toBinaryString(altOdd));
        altEven >>=1;
        altOdd <<=1;
        System.out.println(Integer.toBinaryString(altEven)+"\n"+Integer.toBinaryString(altOdd));
        return (altEven|altOdd);
    }

    public static void main(String[] args) {
        System.out.println(swapBits(GetValue.scanInt("Enter number:")));
    }
}
