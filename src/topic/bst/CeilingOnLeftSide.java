package topic.bst;

import java.util.TreeSet;

public class CeilingOnLeftSide {
	/**
	 * ALGORITHM (int[] a)
	 * BEG
	 * - print - for a[0]
	 * - create a treeset 'ts'
	 * - add a[0] to 'ts'
	 * - for all elements from 1 to length -1 of a : 
	 * 		- if ts has ceililng of a[i] : print ceil
	 * 		- else print -1
	 * 		- ts.add(a[i])
	 * END		
	 * 
	 * @param a
	 */
	public static void fn(Integer[] a) {
		System.out.println(a[0] + "-" + -1);
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(a[0]);
		for (int i = 1; i < a.length; i++) {
			Integer cInteger = tSet.ceiling(a[i]);
			if (cInteger != null)
				System.out.println(a[i] + "-" + cInteger);
			else
				System.out.println(a[i] + "-" + -1);
			tSet.add(a[i]);
		}
	}

	public static void main(String[] args) {
		Integer arr[] = { 2, 8, 30, 15, 25, 12 };

		fn(arr);
	}

}
