package topic.graphs;
import java.util.*;
public class Shortest_Path_in_Unweighted_Graph {
	public static Integer[] BFS(ArrayList<ArrayList<Integer>> adj,Integer vertices,Integer source,Integer[] distances) {
		boolean[] vis = new boolean[vertices];
		Arrays.fill(vis, false);
		distances[source] = 0;
		vis[source] = true;
		
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(source);
		
		while(!q.isEmpty()) {
			Integer temp = q.poll();
			for(Integer adjacent : adj.get(temp)) {
				if(!vis[adjacent]) {
					q.offer(adjacent);
					vis[adjacent] = true;
					distances[adjacent] = distances[temp] + 1;
				}
			}
		}
		return distances;
	}
	public static void main(String[] args) {
		int V = 4; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		adj=GraphsOperation.addEdge(adj,0,1); 
		adj=GraphsOperation.addEdge(adj,1,2); 
		adj=GraphsOperation.addEdge(adj,2,3); 
    	adj=GraphsOperation.addEdge(adj,0,2); 
    	adj=GraphsOperation.addEdge(adj,1,3);
        Integer[] dist=new Integer[V];
        for(int i=0;i<V;i++){
            dist[i]=Integer.MAX_VALUE;
        }
    	dist[0]=0;
    	dist = BFS(adj,V,0,dist); 
        
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }

	}

}
