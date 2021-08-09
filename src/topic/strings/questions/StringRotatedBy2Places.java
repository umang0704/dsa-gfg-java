package topic.strings.questions;

public class StringRotatedBy2Places {
    public static boolean isRotated(String str1, String str2)
    {
        return str2.equals(new StringBuffer(str1).delete(0,2).append(str1.substring(0,2)).toString());
    }
    static boolean fn(String str){
        str=str.toLowerCase();
        String s = "";
        for(int i = 0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i)))
                s+=str.charAt(i);
        }
        System.out.println(s);
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(fn("A man, a plan, a canal: Panama"));
        System.out.println(fn("race a car"));
//        System.out.println(isRotated("fsbcnuvqhffbsaqxwp","wpfsbcnuvqhffbsaqx"));
    }
}
