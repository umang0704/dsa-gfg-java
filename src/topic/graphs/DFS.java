package topic.graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
	static void dfs_rec(ArrayList<ArrayList<Integer>> adj,boolean[] visited,Integer source) {
		visited[source] = true;
		System.out.println(source);
		for(Integer temp : adj.get(source))
			if(!visited[temp])
				dfs_rec(adj, visited, temp);
	}
	
	static void dfs_disconnected_components(ArrayList<ArrayList<Integer>> adj) {
		boolean[] v = new boolean[adj.size()]; 
		Arrays.fill(v, false);
		int count = 0;
		for(int i = 0 ; i < adj.size() ;i++) {
			if(!v[i]) {
				dfs_rec(adj, v, i);
				count++;
			}
		}
		System.out.println("No. of connected components: "+count);
	}
	
	static void dfs(ArrayList<ArrayList<Integer>> adj, Integer source) {
		boolean[] v = new boolean[adj.size()]; 
		Arrays.fill(v, false);
		dfs_rec(adj, v, source);
	}
	
	public static void main(String[] args) {
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

//			addEdge(adj,0,1); 
//        	addEdge(adj,0,2); 
//        	addEdge(adj,2,3); 
//        	addEdge(adj,1,3); 
//        	addEdge(adj,1,4);
//        	addEdge(adj,3,4);
		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,2);
    	addEdge(adj,3,4);
		
		System.out.println("Following is Depth First Traversal: ");  
	    dfs_disconnected_components(adj);
	}

}
