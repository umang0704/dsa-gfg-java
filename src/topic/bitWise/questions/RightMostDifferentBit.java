package topic.bitWise.questions;

public class RightMostDifferentBit {
    //Function to find the first position with different bits.
    public static int log2(int N){
        int result = (int)(Math.log(N) / Math.log(2));

        return result;
    }
    public static int posOfRightMostDiffBit(int m, int n)
    {
        //if(m>Math.pow(10,9) || m<1) return -1;
        //if(n>Math.pow(10,9) || n<1) return -1;
        // Your code here
        int xor = m^n;
        return (int)(log2(xor&(~(xor-1)))+1);
    }
}
