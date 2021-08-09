package topic.strings;

import topic.utilities.GetValue;

public class PattrenSearchAlgorithm {

    /**
     * When characters are repeated in pattern
     *
     * @param string
     * @param pattern
     */
    static void indexOfPattern(String string, String pattern) {
        int sizeStr = string.length();
        int sizePattern = pattern.length();
        for (int i = 0; i <= sizeStr - sizePattern; i++) {
            int j;
            for (j=0; j < sizePattern; j++)
                if (string.charAt(i + j) != pattern.charAt(j))
                    break;
            if (j == sizePattern)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        indexOfPattern("lkjsdfhaiuehaoewiuraoikdehjakdsfhlsjdkihalieushralkehfailuewhfaklfjsdhfliuewahf","ahf");
//        System.out.println("When characters in pattern are repeated:\n");
//        indexOfPattern(GetValue.scanString("String1:"), GetValue.scanString("String 2"));
    }
}
/*

ABACABAB
ABAB
 */