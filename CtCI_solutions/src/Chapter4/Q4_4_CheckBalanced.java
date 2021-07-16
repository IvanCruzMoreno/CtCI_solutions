package Chapter4;

import Commons.TreeNode;

public class Q4_4_CheckBalanced {

	/*
	 *  Input: 
	 *                       -1(4)
	 *                     /      \
	 *               3-(222)       -1-(10)
	 *                /     \     /      \
	 *           2-(999)  1-(3) 1-(-6)  3-(1)
	 *            /     \                /   \
	 *       1-(101)  1-(7)        1-(666)  2-(333)
	 *                                          \
	 *                                        1-(8)
	 * 
	 * n = 4 
	 * 
	 * if n = null
	 *    return 0
	 *    
	 * left = mostHeight(n.left)
	 * if left = -1
	 *    return -1
	 *    
	 * right = mostHeight(n.right)
	 * if right = -1
	 *    return -1
	 * 
	 * if Math.abs(right - left) > 1
	 *     return -1
	 *     
	 * return Math.max(left, right) + 1
	 * 
	 * */
	
	public boolean checkBalanced(TreeNode root) {
		return isBalanced(root) != -1;
	}
	
	private int isBalanced(TreeNode n) {
		
		if(n == null) {
			return 0;
		}
		
		int leftHeight = isBalanced(n.left);
		if(leftHeight == -1) {
			return -1;
		}
		
		int rightHeight = isBalanced(n.right);
		if(rightHeight == -1) {
			return -1;
		}
		
		if(Math.abs(rightHeight - leftHeight) > 1) {
			return -1;
		}
		
		return Math.max(rightHeight, leftHeight) + 1;
	}
}
