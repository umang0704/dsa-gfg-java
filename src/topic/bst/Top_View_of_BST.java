package topic.bst;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Top_View_of_BST {
	
	static class Pair{
		Node root;
		int hd;	
		Pair(Node root,int hd){
			this.root = root;
			this.hd = hd;
		}
	}
	
	static TreeMap<Integer,Integer> mp = new TreeMap<>();
	
	static void topView(Node root) {
		if(root == null) return;
		
		Queue<Pair> queue= new ArrayDeque<>();
		queue.offer(new Pair(root, 0));
		while (!queue.isEmpty()) {
			Pair t = queue.poll();
			Node rNode = t.root;
			int hd = t.hd;
			
			if(!mp.containsKey(hd))
				mp.put(hd, rNode.key);
			if(rNode.left!=null)
				queue.offer(new Pair(rNode.left,hd-1));
			if(rNode.right!=null)
				queue.offer(new Pair(rNode.right,hd+1));
		}
		
		for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);  
        root.left = new Node(20);  
        root.right = new Node(30);  
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        
        topView(root);
	}

}
