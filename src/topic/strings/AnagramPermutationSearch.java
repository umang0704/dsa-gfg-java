package topic.strings;

import topic.utilities.GetValue;

public class AnagramPermutationSearch {
    /**
     *
     * @param array1
     * @param array2
     * @return
     */
    static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;
        else
            for (int i = 0; i < array1.length; i++)
                if (array1[i] != array2[i])
                    return false;
        return true;
    }

    static boolean isAnagramPermutation(String str, String pattern) {
        int[] countStr = new int[256];
        int[] countPattern = new int[256];
        for (int i = 0; i < pattern.length(); i++) {
            countStr[str.charAt(i)]++;
            countPattern[pattern.charAt(i)]++;
        }
        for(int i = pattern.length() ; i<str.length() ; i++){
            if(areArraysEqual(countStr,countPattern))
                return true;
            countStr[str.charAt(i)]++;
            countStr[str.charAt(i-pattern.length())]--;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramPermutation(GetValue.scanString("Enter String:"),GetValue.scanString("Enter Pattern:")));
    }
}
/*
geeksforgeeks
gorf
 */