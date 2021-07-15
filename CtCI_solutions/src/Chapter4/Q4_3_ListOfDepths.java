package Chapter4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import Commons.TreeNode;

public class Q4_3_ListOfDepths {

	/*
	 * 	
	 *  Input: 
	 *                       (4)
	 *                     /      \
	 *                 (222)        (10)
	 *                /     \     /      \
	 *             (999)    (3) (-6)      (1)
	 *                                   /
	 *                                (666)
	 *                                
	 *                                
	 *   queue = [ 
	 *   List general
	 *   
	 *   while queue.isNotEmpty
	 *   
	 *   	index = queue.size //1
	 *      List subList
	 *      
	 *      for i=0; i<index; i++
	 *      	n = queue.remove  //(666)
	 *      	
	 *          for child: n.children 
	 *              if child != null 
	 *                  queue.add(child)
	 *              
	 *          sublist.add(n)     
	 *      
	 *      general.add(sublist)
	 *  
	 *   
	 *  Output:
	 *  	List<List<int>>  { [4], [222, 10], [999, 3, -6, 1], [666] }
	 * 
	 * */
	
	
	public List<List<Integer>> listOfDepths(TreeNode root){
		
		if(root == null) {
			return null;
		}
		
		Queue<TreeNode> queue = new ArrayDeque<>();
		List<List<Integer>> generalList = new ArrayList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int index = queue.size();
			List<Integer> subList = new ArrayList<>();
			
			for(int i=0; i<index; i++) {
				
			    TreeNode currentNode = queue.remove();
				
				if(currentNode.left != null) {
					queue.add(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.add(currentNode.right);
				}
				
				subList.add(currentNode.value);
			}
			generalList.add(subList);
		}
		
		return generalList;
		
		
	}
}
