package topic.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
 static void bfs(ArrayList<ArrayList<Integer>> graph,int source) {
	 Queue<Integer> q = new LinkedList<>();
	 boolean[] visited = new boolean[graph.size()];
	 visited[source] = true;
	 q.offer(source);
	 
	 while(!q.isEmpty()) {
		 Integer t = q.poll();
		 System.out.print(t+" ");
		 for(Integer adjacent : graph.get(t)) {
			 if(!visited[adjacent]) {
				 q.offer(adjacent);
				 visited[adjacent] = true;
			 }
		 } 
	 } 
 }
	public static void main(String[] args) {
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3);
    	addEdge(adj,3,4);
    	addEdge(adj,2,4);
		
		System.out.println("Following is Breadth First Traversal: "); 
		bfs(adj,0);

	}

}
