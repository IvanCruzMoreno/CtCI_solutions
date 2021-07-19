package Chapter4;

import Commons.TreeFunctions;
import Commons.TreeNode;

public class Q4_6_Successor_Test {

	/*                       null p
	 *                        |
	 *                      (100)c
	 *                    /       \
	 *                 (50)p       (150)
	 *                /    \     /     \
	 *            (20)c     (60) (130)   (163)
	 *            /   \                 /    \
	 *         (10)   (30)         (154)   (165)
	 */
	
	public static void main(String[] args) {
		
		TreeNode root = TreeFunctions.generateBST();
		TreeNode node = root.right.right.right;
		TreeNode node2 = root.left.right;
		
		System.out.println("Root Successor: " + Q4_6_Successor.successor(root).value);
		System.out.println("Node 165 Successor: " + Q4_6_Successor.successor(node));
		System.out.println("Node 60 Successor: " + Q4_6_Successor.successor(node2).value);
		
	}
}
