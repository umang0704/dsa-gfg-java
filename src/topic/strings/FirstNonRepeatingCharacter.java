package topic.strings;

import topic.utilities.GetValue;
import topic.utilities.Operations;

import java.util.Arrays;

public class FirstNonRepeatingCharacter {
    static char firstNonRepeatingCharacter(String a) {
        int index = Integer.MAX_VALUE;
        int[] arr = new int[256];
        Arrays.fill(arr, -1);
        for (int i = 0; i < a.length(); i++) {
            if (arr[a.charAt(i)] == -1)
                arr[a.charAt(i)] = i;
            else
                arr[a.charAt(i)] = -2;
        }
        for (int i : arr)
            if (i > 0)
                index = (int) Operations.minOf2(i, index);
        return a.charAt(index);
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter(GetValue.scanString("String for first non repeating character:")));
    }
}
