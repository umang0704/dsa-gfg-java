package topic.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs_diconnected {
	private static boolean[] visited;

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static void bfs(ArrayList<ArrayList<Integer>> graph, int source) {
		Queue<Integer> q = new LinkedList<>();
		visited[source] = true;
		q.offer(source);

		while (!q.isEmpty()) {
			Integer t = q.poll();
			System.out.print(t + " ");
			for (Integer adjacent : graph.get(t)) {
				if (!visited[adjacent]) {
					q.offer(adjacent);
					visited[adjacent] = true;
				}
			}
		}
		System.out.println();
	}

static void bfs_disconnected(ArrayList<ArrayList<Integer>> adj) {
	visited = new boolean[adj.size()];
	//this count is used when we have to count no.
	//of disconnected component in the graph
	int count = 0;
	for(int i = 0 ; i < adj.size() ; i++) {
		if(!visited[i]) {
			bfs(adj,i);
			count++;
		}
	}
	System.out.println("no. of disconneted component: "+count);
}

	public static void main(String[] args) {
		int V = 7; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0,1); 
        	addEdge(adj,0,2); 
        	addEdge(adj,2,3); 
        	addEdge(adj,1,3); 
        	addEdge(adj,4,5);
        	addEdge(adj,5,6);
        	addEdge(adj,4,6);
		
		System.out.println("Following is Breadth First Traversal: "); 
	    bfs_disconnected(adj);
	}
}
