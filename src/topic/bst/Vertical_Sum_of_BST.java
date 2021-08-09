package topic.bst;

import java.util.*;

public class Vertical_Sum_of_BST {
	static void vSum(Node root,int hd,TreeMap<Integer,Integer> mp) {
		if(root == null) return;
		
		vSum(root.left, hd-1,mp);
		
		int pSum = mp.get(hd) == null ? 0 : mp.get(hd);
		mp.put(hd,pSum+root.key);
		
		vSum(root.right, hd+1, mp);
		
	}
	static void printSum(Node root) {
		TreeMap<Integer, Integer> mpMap = new TreeMap<>();
		vSum(root, 0, mpMap);
		for(Map.Entry<Integer, Integer> e : mpMap.entrySet())
			System.out.println(e.getValue());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(50);  
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        
        printSum(root);
	}

}
