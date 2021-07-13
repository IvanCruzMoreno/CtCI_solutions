package Chapter4;

import java.util.ArrayDeque;
import java.util.Queue;

import Commons.GraphNode;

public class Q4_1_RouteBetweenNodes {

	
	/*
	 * 		   
	 * 	(2)-->(3)-----> (9)
	 * 	 | 	  >		  	 |
	 * 	 |	 /		  	 |
	 *   v	/		  	 v
	 * 	(5)--->(16)<----(8)
	 * 	 l	     x		 l
	 * 
	 * 
	 *  
	 *  node1 = 5
	 *  node2 = 8
	 *  
	 *  node = 5, 3, 16, 9, 8
	 *  queue = [ ]
	 * */
	
	
	public boolean isTherePath(GraphNode node1, GraphNode node2) {
		
		if(node1 == null || node2 == null) {
			return false;
		}
			
		Queue<GraphNode> queue = new ArrayDeque<>();
		node1.visited = true;
		queue.add(node1);
		
		while(!queue.isEmpty()) {
			GraphNode n = queue.remove();
			
			if(n == node2) return true;
			
			for(GraphNode node: n.neighbors) {
				if(!node.visited) {
					node.visited = true;
					queue.add(node);
				}
			}
			
		}
		return false;
	}
}
