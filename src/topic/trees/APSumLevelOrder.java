package topic.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class APSumLevelOrder {
	List<Integer> list =new ArrayList<>(); 
	List<Integer> f(Node root){
		int a= -1; 
		int d=0;
		int x = 0;
		if(root != null) {
			Queue<Node> q = new LinkedList<>();
			q.offer(root);
			int flag = 2;
			while(!q.isEmpty()) {
				int size =q.size();
				int cs = 0;
				for(int i = 0 ; i < size ; i++) {
					Node t = q.poll();
					cs+=t.key;
					if(t.left!=null) q.offer(t.left);
					if(root.right!=null) q.offer(t.right);
				} 
				if(flag == 2) {
					a = cs;
					flag--;
					list.add(0);
					
				}else if(flag ==1) {
					d=cs-a;
					list.add(0);
					x = cs;
				}else {
					list.add(x+d-cs);
					x=cs;
				}
			}
		}
		return list;
	}
}
