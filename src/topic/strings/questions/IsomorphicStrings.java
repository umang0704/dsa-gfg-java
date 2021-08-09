package topic.strings.questions;

import java.util.*;

public class IsomorphicStrings {
    private static Character charAt(String s , int i){
        return new Character(s.charAt(i));
    }
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()) return false;


        LinkedHashMap<Character,Character> t = new LinkedHashMap<>();
        for(int i = 0 ;i< str1.length();i++){
            if(!t.containsKey(charAt(str1,i)) && !t.containsKey(charAt(str1,i))){
                t.put(charAt(str1,i),charAt(str2,i));
                t.put(charAt(str2,i),charAt(str1,i));
            }else{
                if(t.get(charAt(str1,i))!=charAt(str2,i)){
                    return false;
                }
                if(t.get(charAt(str2,i))!=charAt(str1,i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println( areIsomorphic("wfca","yssy"));
    }
}
