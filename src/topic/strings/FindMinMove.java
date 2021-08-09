package topic.strings;

import java.util.Arrays;

public class FindMinMove {
	static int minMove(int [] arr, int k) {
		Arrays.sort(arr);
		int count = 1;
		int res = 0;
		for(int i = 0 ; i< arr.length ;i++) {
			//System.out.println(res+"-["+arr[i]+"]-"+count);
			res += arr[i];
			if(res>k) {
				count++;
				res=0;
				i--;
			}
				
		}
		return count;
	}
	public static void main(String[] args) {
		int a[] = {3,2,2,1};
		int k = 3;
		System.out.println(minMove(a, k));
	}
}
