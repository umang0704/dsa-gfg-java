package topic.bitWise;

import topic.utilities.GetValue;
import topic.utilities.Operations;

public class PowerSetForString {
    /**
     *
     * @param str
     */
    public static void powerSet(String str){
        char[] arr = str.toCharArray();
        int powerSetSize = (int)Math.pow(2,str.length());
        Operations.printCharArray(arr);
        for(int i = 0; i<powerSetSize;i++){
            for (int j = 0;j<str.length();j++){
                if((i & (1<<j))!=0){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        powerSet(GetValue.scanString("Enter String to get power set:"));
    }
}
