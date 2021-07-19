package Chapter4;

import Commons.TreeNode;

public class Q4_6_Successor {

	/*                       null p
	 *  Input:                |
	 *                      (100)c
	 *                    /       \
	 *                 (50)p       (150)
	 *                /    \     /     \
	 *            (20)c     (60) (130)   (163)
	 *            /   \                 /    \
	 *         (10)   (30)         (154)   (165)
	 *                              
	 *         
	 *   1) the node has right child 
	 *   		return the most left leaf
	 *   2) the node hasn't right child
	 *   		check if child is parent.left
	 *                 return parent
	 *           
	 * */
	
	public static TreeNode successor(TreeNode n) {
		if(n == null) {
			return null;
		}
		if(n.right != null) {
			return mostLeft(n.right);
		}else {
			return checkParent(n);
		}
	}
	
	private static TreeNode mostLeft(TreeNode n) {
		TreeNode aux = n;
		
		while(aux.left != null) {
			aux = aux.left;
		}
		
		return aux;
	}
	
	private static TreeNode checkParent(TreeNode n) {
		TreeNode parent = n.parent;
		TreeNode child = n;
		
		while(parent != null && parent.left != child) {
			child = parent;
			parent = parent.parent;
		}
		
		return parent;
	}
	
}
