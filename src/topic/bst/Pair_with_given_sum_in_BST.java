package topic.bst;

import java.util.ArrayList;
import java.util.HashSet;

public class Pair_with_given_sum_in_BST {
	static ArrayList<Integer> a = new ArrayList<>();
	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			a.add(root.key);
			inorder(root.right);
		}
	}
	public static boolean m1(Node root,int sum) {
		inorder(root);
		int l = 0,r = a.size()-1;
		while(l<r) {
			int a1 = a.get(l);
			int a2 = a.get(r);
			if(a1+a2 == sum) return true;
			if(a1+a2>sum) r--;
			if(a1+a2<sum) l++;
		}
		return false; 
	}
	static HashSet<Integer> hashSet = new HashSet<>();
	public static boolean m2(Node root,int sum,HashSet<Integer> hs) {
		if(root == null) return false;
		if(m2(root.left, sum, hs)== true) return true;
		if(hs.contains(sum-root.key))
			return true;
		else
			hs.add(root.key);
		return m2(root.right, sum, hs);
	}
	
	public static void main(String[] args) { 
		Node root = new Node(10);  
        root.left = new Node(8);  
        root.right = new Node(20);  
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(30);  
        root.right.right.left = new Node(25);
        
        int sum=33;
        System.out.println(m1(root, sum));
        System.out.println(a);
        System.out.println(m2(root, sum, hashSet));
        System.out.println(hashSet);
	}

}
