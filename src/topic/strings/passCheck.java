package topic.strings;
import java.util.*;
public class passCheck {
	static String parenPass(String str) {
		Stack<Character> stack = new Stack<>();
		String ret = "Yes";
		for(int i = 0 ; i < str.length(); i++) {
			if(ret == "No")
				return ret;
			Character t = str.charAt(i);
			if(t == '(' || t=='{'  ||t=='[' ) {
				stack.push(t);
			}else if(t == ')'|| t=='}'|| t==']' ) {
				if(i == 0)
					ret ="No";
				Character tx = stack.pop();  
				if(( tx=='(' &&t==')'))
					ret = "Yes"; 
				
				else if((tx=='{' && t=='}'))
					ret = "Yes";
				
				else if((tx=='[' && t==']'))
					ret= "Yes";
				else
					ret = "No";
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(parenPass("({[]})"));
	}
}
