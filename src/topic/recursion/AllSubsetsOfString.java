package topic.recursion;

import topic.utilities.GetValue;

public class AllSubsetsOfString {
    static void printStringSubsets(String str,String fsub,int index){ 
        if(index == str.length()) {
            System.out.print(fsub+", ");
            return;
        }
        printStringSubsets(str,fsub,index+1);
        printStringSubsets(str,fsub+str.charAt(index),index+1);
    }
    public static void main(String[] args) {
        printStringSubsets(GetValue.scanString("Enter the string"),"",0);
    }
}
