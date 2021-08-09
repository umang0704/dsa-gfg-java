package topic.bitWise;

import topic.utilities.GetValue;

public class TwoOddAppearing {
    public static void usingXOR(Integer[] array){
        int xor = 0,r1 = 0, r2 = 0;
        for(int i : array)
            xor ^= i;
        int setBit = xor ^(~(xor-1));
        for(int i : array)
            if((i & setBit) != 0)
                r1 ^= i;
            else
                r2 ^= i;
        System.out.println(r1);
        System.out.println(r2);
    }
    public static void main(String[] args) {
        Integer[] arr = GetValue.getIntArray("Enter array with exactly two number appearing odd number of times, rest only even number of times:");
        usingXOR(arr);
    }
}
