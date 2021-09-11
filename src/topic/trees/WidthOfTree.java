package topic.trees;

import java.util.*;

public class WidthOfTree {
	public static int findMinAngle(int h,int m) {
		int a = Math.abs(30*h - (11*m)/2);
		return Math.min(a, 360-a);
	}
    public static int w(Node root) {
        if (root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int w = 0;

        while (!q.isEmpty()) {
            int s = q.size();
            w = Math.max(w,s);
            for (int i = 0; i < s; i++) {
                Node t = q.poll();
                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }
        }
        return w;
    }
    static int findElement(List<Integer> arr ){
           int n = arr.size();
           Integer[] leftMax = new Integer[n];
           leftMax[0] = Integer.MIN_VALUE;
 
           for (int i = 1; i < n; i++)
                leftMax[i] = Math.max(leftMax[i - 1], arr.get(i-1));
           
           int rightMin = Integer.MAX_VALUE;
           
           for (int i = n - 1; i >= 0; i--){ 
                if (leftMax[i] < arr.get(i) && rightMin > arr.get(i))
                    return i;
 
                rightMin = Math.min(rightMin, arr.get(i));
           } 
           return -1;

            
    }
//    public static void main(String[] args) {
//		System.out.println(findMinAngle(9, 0));
//		List<Integer> aIntegers = new ArrayList();
//		Integer[] i = {5,1,4,3,6,8,10,7,9};
//		for(Integer j: i)
//			aIntegers.add(j);
//		System.out.println(findElement(aIntegers));
//	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = "";
		for(int i =0 ; i <  s.length(); i++) 
			res+=(char)(Integer.parseInt(s.substring(i,i+1))+97);
		System.out.println(res);
		
	}

}
