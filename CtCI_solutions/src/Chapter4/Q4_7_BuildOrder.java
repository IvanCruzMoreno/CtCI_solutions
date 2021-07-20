package Chapter4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import Commons.NodeGraph;
import Commons.Status;

public class Q4_7_BuildOrder {

	/*
	 *   input: 
	 *         projects: a, b, c, d, e, f
	 *         dependencies: (a,d), (f,b), (b,d), (f,a), (d,c)
	 *         
	 *         a -> d -> c
	 *         ^    ^
	 *         |    |            output: [c, d, a, b, e, f, root]
	 *         f -> b
	 *  
	 *  1) build our nodes 
	 *      a, b, c, d, e, f 
	 *    
	 *  2) build "graph"
	 *      a { d
	 *      b { d
	 *      c {
	 *      d { c
	 *      e {
	 *      f { b, a
	 *  
	 *  3)  #    #  #  #  #  #  #
	 *     root {a, b, c, d, e, f
	 *  
	 *  4) 
	 *  -- function (root, queue)
	 *    
	 *    root.status = active
	 *    
	 *    for n: root.children
	 *       if(n.status == active)
	 *       	throw new Exception("Error: Loop detected!")
	 *       if(n.status == new)
	 *           function (n)
	 *    
	 *    n.status = done
	 *    queue.add(n)
	 *               
	 *     
	 * */
	private Map<String, NodeGraph> nodes;
	
	public Q4_7_BuildOrder() {
		nodes = new HashMap<>();
	}
	
	public Stack<String> buildOrder(List<String> projects, String[][] dependencies) throws Exception{
		
		for(String c: projects) {
			nodes.put(c, new NodeGraph(c));
		}
		
		for(String d[]: dependencies) {
			String project = d[0];
			String dependence = d[1];
			
			NodeGraph projectNode = nodes.get(project);
			NodeGraph dependenceNode = nodes.get(dependence);
			
			projectNode.addDirectedNeighbor(dependenceNode);
		}
		
		NodeGraph root = new NodeGraph("root");
		
		nodes.forEach((k,v) -> {
			NodeGraph project = nodes.get(k);
			root.addDirectedNeighbor(project);
		});
		
		Stack<String> stack = new Stack<>();
		
		buildOrderAux(root, stack);
		
		stack.pop(); //remove "root"
		
		return stack;
	}
	
	
	private void buildOrderAux(NodeGraph n, Stack<String> stack) throws Exception{
		
		n.status = Status.ACTIVE;
		
		for(NodeGraph neighbor: n.neighbors) {
			if(neighbor.status == Status.ACTIVE) {
				throw new Exception("Error: Loop detected!");
			}
			if(neighbor.status == Status.NEW) {
				buildOrderAux(neighbor, stack);
			}
		}
		
		n.status = Status.DONE;
		stack.add(n.value);
	}
}
