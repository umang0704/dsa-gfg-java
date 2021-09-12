package rough;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static String solution(String S) {
		StringBuilder s1 = new StringBuilder(S); 
		
		while(s1.toString().contains("AB") || s1.toString().contains("BA")) {
			String t = "";
			if(s1.toString().contains("AB")) 
				t= "AB";
			else 
				t = "BA";
			int i = s1.indexOf(t);
			s1.delete(i, i+2);
		}
		while(s1.toString().contains("CD") || s1.toString().contains("DC")) {
			String t = "";
			if(s1.toString().contains("CD")) 
				t= "CD";
			else 
				t = "DC";
			int i = s1.indexOf(t);
			s1.delete(i, i+2);
		}
		return s1.toString();
	}
	
	
	public static void main(String[] args) {
		
	}
}
