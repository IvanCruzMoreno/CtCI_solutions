package Chapter4;

import Commons.TreeFunctions;
import Commons.TreeNode;

public class Q4_4_CheckBalanced_Test {

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
	 */
	
	public static void main(String[] args) {
		
		Q4_4_CheckBalanced checkB = new Q4_4_CheckBalanced();
		
		TreeNode root1 = TreeFunctions.generateBinaryTreeNotBalanced();
		System.out.println("Is balanced: " + checkB.checkBalanced(root1));
		
        TreeNode root2 = TreeFunctions.generateBinaryTree();
		System.out.println("Is balanced: " + checkB.checkBalanced(root2));
	}
	
	
}
