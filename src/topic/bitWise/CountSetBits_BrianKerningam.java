package topic.bitWise;

import topic.utilities.GetValue;

public class CountSetBits_BrianKerningam {
    public static void countSetBits(int k){
        int res = 0;
        while (k>0){
            k&=k-1;
            res++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int k = GetValue.scanInt("Enter number:");
        countSetBits(k);
    }
}
