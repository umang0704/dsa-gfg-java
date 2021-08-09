package topic.bitWise.questions;

public class LongestConsecutive1s {
    public static int maxConsecutiveOnes(int N) {

        // Your code here
        int res = 0;
        while(N!=0){
            res++;
            N &= (N<<1);
        }
        return res;
    }
}
