package topic.bitWise;

import topic.utilities.GetValue;

public class CountSetBits_LookUpTable {
    private static final Integer[] lookUpTable = new Integer[256];
    public static void initialize(){
        lookUpTable[0] = 0;
        for(int i = 0;i<256;i++){
            lookUpTable[i]= (i&1)+lookUpTable[i/2];
        }
    }
    public static void count(int k){
        initialize();
        System.out.println(lookUpTable[k&0xff]+
                lookUpTable[(k>>8)&0xff]+
                lookUpTable[(k>>16)&0xff]+
                lookUpTable[(k>>24)&0xff]);
    }
    public static void main(String[] args) {
              int n = GetValue.scanInt("Enter number:");
              count(n);
    }
}