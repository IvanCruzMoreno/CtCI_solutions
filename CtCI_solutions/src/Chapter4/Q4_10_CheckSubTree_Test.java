package Chapter4;

import Commons.TreeFunctions;
import Commons.TreeNode;

public class Q4_10_CheckSubTree_Test {

	public static void main(String[] args) {
		
		TreeNode T1 = TreeFunctions.generateBinaryTree();
		TreeNode T2 = T1.right.right;
		
		Q4_10_CheckSubTree q10 = new Q4_10_CheckSubTree();
		System.out.println("Contains T1 to T2 (true): " + q10.checkSubTree(T1, T2));
		
		TreeNode T3 = new TreeNode(4);
		System.out.println("Contains T1 to T3 (false): " + q10.checkSubTree(T1, T3));
		
		System.out.println("Contains T1 to T1 (true): " + q10.checkSubTree(T1, T1));
		
	}
}
