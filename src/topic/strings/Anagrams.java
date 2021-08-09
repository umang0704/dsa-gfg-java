package topic.strings;

import topic.utilities.GetValue;

public class Anagrams {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] arr = new int[256];
        for (int i = 0; i < s1.length(); i++)
            arr[s1.charAt(i)]++;
        for (int i = 0; i < s2.length(); i++)
            arr[s2.charAt(i)]--;
        for (int i : arr)
            if (i != 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram(GetValue.scanString("First String:"), GetValue.scanString("Second String:")));
    }
}
