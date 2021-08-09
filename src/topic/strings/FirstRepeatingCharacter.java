package topic.strings;

import topic.utilities.GetValue;
import topic.utilities.Operations;

import java.util.Arrays;

public class FirstRepeatingCharacter {
    static int indexOfFirstRepeatingCharacter(String a) {
        int index = Integer.MAX_VALUE;
        int[] arr = new int[256];
        Arrays.fill(arr, -1);
        for (int i = 0; i < a.length(); i++) {
            if (arr[a.charAt(i)] == -1)
                arr[a.charAt(i)] = i;
            else
                index = (int) Operations.minOf2(index, arr[a.charAt(i)]);
        }
        return index;
    }

    static char firstRepeatingCharachetr(String a) {
        int index = Integer.MAX_VALUE;
        int[] arr = new int[256];
        Arrays.fill(arr, -1);
        for (int i = a.length(); i >= 0; i++) {
            if (arr[a.charAt(i)] == -1)
                arr[a.charAt(i)] = i;
            else
                index = arr[a.charAt(i)];
        }
        return a.charAt(index);
    }

    public static void main(String[] args) {
        String test = GetValue.scanString("Enter String for repeating characters:");
        System.out.println(test.charAt(indexOfFirstRepeatingCharacter(test)));
        System.out.println(firstRepeatingCharachetr(test));
    }
}
