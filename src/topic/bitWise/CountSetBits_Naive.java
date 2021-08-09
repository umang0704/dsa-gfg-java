package topic.bitWise;

import topic.utilities.GetValue;

public class CountSetBits_Naive {
    public static void setBits(int k){
        int res = 0;
        while(k>0){
            if(k%2!=0)
                res++;
            k/=2;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int n = GetValue.scanInt("Enter number");
        setBits(n);
    }
}
