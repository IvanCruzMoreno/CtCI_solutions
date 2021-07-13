package Chapter4;

import Commons.GraphNode;

public class Q4_1_RouteBetweenNodes_Test {

	public static void main(String[] args) {
		
		/*
		 * 		   
		 * 	(2)-->(3)-----> (9)
		 * 	 | 	  >		  	 |
		 * 	 |	 /		  	 |
		 *   v	/		  	 v
		 * 	(5)--->(16)<----(8)
		 * 	 	     		 
		 * 
		 */
		
		GraphNode graph2 = new GraphNode(2);
		GraphNode graph3 = new GraphNode(3);
		GraphNode graph9 = new GraphNode(9);
		GraphNode graph8 = new GraphNode(8);
		GraphNode graph16 = new GraphNode(16);
		GraphNode graph5 = new GraphNode(5);
		
		graph2.addDirectedNeighbor(graph3);
		graph2.addDirectedNeighbor(graph5);
		
		graph5.addDirectedNeighbor(graph3);
		graph5.addDirectedNeighbor(graph16);
		
		graph3.addDirectedNeighbor(graph9);
		
		graph9.addDirectedNeighbor(graph8);
		
		graph8.addDirectedNeighbor(graph16);
		
		Q4_1_RouteBetweenNodes routeBetweenNodes = new Q4_1_RouteBetweenNodes();
		
		System.out.println("from Node5 to Node8 (true): " + routeBetweenNodes.isTherePath(graph5, graph8));
		//System.out.println("from Node16 to Node2 (false): " + routeBetweenNodes.isTherePath(graph16, graph2));
		//System.out.println("from Node2 to Node16 (true): " + routeBetweenNodes.isTherePath(graph2, graph16));
		//System.out.println("from Node9 to Node3 (false): " + routeBetweenNodes.isTherePath(graph9, graph3));
	}
}
