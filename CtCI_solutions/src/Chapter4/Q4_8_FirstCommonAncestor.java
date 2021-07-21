package Chapter4;

import Commons.TreeNode;

public class Q4_8_FirstCommonAncestor {

	/*
	 *   
	 *                       (4)
	 *                     /      \
	 *                 (222)       (10)
	 *                /     \     /      \
	 *           (999)      (3) (-6)      (1)
	 *            /  \                   /   \
	 *       (101)   (7)              (666)  (333)
	 *                                          \
	 *                                          (8)
	 *   input:
	 *            node1 = (222) 
	 *            node2 = (8)
	 *            
	 *   ----
	 *   
	 *   1) see which node is deeper 
	 *       small = nodeSize1 > nodeSize2 ? nodeSize2 : nodeSize1
	 *       big = nodeSize1 > nodeSize2 ? nodeSize1 : nodeSize2
	 *   
	 *   2) put the both nodes on the same level 
	 *        
	 *        diff = Math.abs(nodeSize1 - nodeSize2)
	 *        for int i = 0; i < diff; i++
	 *             small = small.parent
	 *   
	 *   3) until big and small != null
	 *       if( big == small) 
	 *            return big
	 *        big = big.parent
	 *        small = small.parent
	 *      
	 *      return null
	 */
	
	public TreeNode firstCommonAncestor(TreeNode node1, TreeNode node2) {
		
		if(node1 == null || node2 == null) {
			return null;
		}
		
		int nodeSize1 = getSize(node1);
		int nodeSize2 = getSize(node2);
		
		TreeNode big = nodeSize1 > nodeSize2 ? node1 : node2;
		TreeNode small = nodeSize1 > nodeSize2 ? node2 : node1;
		
		int diff = Math.abs(nodeSize1 - nodeSize2);
		
		big = putOnSameLevel(big, diff);
		
		while(big != null && small != null) {
			if(big == small) {
				return big;
			}
			big = big.parent;
			small = small.parent;
		}
		return null;
	}
	
	private TreeNode putOnSameLevel(TreeNode n, int diff) {
		int i = 0;
		while(n != null && i < diff) {
			n = n.parent;
			i++;
		}
		return n;
	}
	
	private int getSize(TreeNode n) {
		int size = 0;
		TreeNode aux = n;
		
		while(aux != null) {
			size++;
			aux = aux.parent;
		}
		
		return size;
	}
	
	
	
}
