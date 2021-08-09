package topic.bitWise.questions;

public class NumberIsSparse {
    public static boolean isSparse(int n)
    {
        // Your code here
        return ((n&(n<<1))==0);
    }
}
