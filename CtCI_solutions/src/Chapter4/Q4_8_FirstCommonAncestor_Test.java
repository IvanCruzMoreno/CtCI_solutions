package Chapter4;

import Commons.TreeFunctions;
import Commons.TreeNode;

public class Q4_8_FirstCommonAncestor_Test {

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
	 */
	
	public static void main(String[] args) {
		Q4_8_FirstCommonAncestor Q4 = new Q4_8_FirstCommonAncestor();
		
		TreeNode root = TreeFunctions.generateBinaryTreeNotBalanced();
		
		
		TreeNode answer = Q4.firstCommonAncestor(root.left.left, root.right.right.right.right);
		System.out.println("Answer (4): " + answer.value);
		
		TreeNode answer2 = Q4.firstCommonAncestor(root.right.left, root.right.right.left);
		System.out.println("Answer (10): " + answer2.value);
	}
}
