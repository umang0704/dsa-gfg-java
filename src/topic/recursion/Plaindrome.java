package topic.recursion;

import topic.utilities.GetValue;

public class Plaindrome {
    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = GetValue.scanString("Enter String for sum of digits");
        System.out.println(isPalindrome(str,0,str.length()-1));
    }
}