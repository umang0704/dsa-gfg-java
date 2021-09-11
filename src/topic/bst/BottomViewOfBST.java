package topic.bst;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBST {
	static class Pair{
		Node root;
		int hd;
		public Pair(Node root, int hd) {
			this.root = root;
			this.hd = hd;
		}
	}
	
	static void BottomView(Node root) {
		if(root == null) return;
		
		Queue<Pair> q = new ArrayDeque<>();
		q.offer(new Pair(root, 0));
		
		TreeMap<Integer, Integer> mpMap = new TreeMap<>();
		while(!q.isEmpty()) {
			Pair tp = q.poll();
			Node t = tp.root;
			Integer hd = tp.hd;
			
			mpMap.put(hd, t.key);
			if(t.left!=null)
			q.offer(new Pair(t.left, hd-1));
			if(t.right!=null)
			q.offer(new Pair(t.right, hd+1));
		}
		for(Map.Entry<Integer, Integer> entry : mpMap.entrySet())
			System.out.print(entry.getValue()+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node root = new Node(10);  
	        root.left = new Node(20);  
	        root.right = new Node(30);  
	        root.left.left = new Node(40);
	        root.left.right = new Node(50);
	        
	        BottomView(root);
	}

}
