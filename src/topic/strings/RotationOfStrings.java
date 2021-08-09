package topic.strings;

import topic.utilities.GetValue;

public class RotationOfStrings {
    static boolean rotationExist(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        str1 += str1;
        return str1.indexOf(str2) >= 0;
    }

    public static void main(String[] args) {
        System.out.println(rotationExist(GetValue.scanString("Checking Rotation of Str 1 and Str2 \nEnter String 1:"), GetValue.scanString("Enter String 2:")));
    }
}
