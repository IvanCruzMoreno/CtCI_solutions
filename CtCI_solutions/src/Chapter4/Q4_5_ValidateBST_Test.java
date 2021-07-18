package Chapter4;

import Commons.TreeFunctions;
import Commons.TreeNode;

public class Q4_5_ValidateBST_Test {

	public static void main(String[] args) {
		
		TreeNode noBST = TreeFunctions.generateBinaryTree();
		boolean a1 = Q4_5_ValidateBST.validateBST(noBST);
		System.out.println("Answer (false): " + a1);
		
		TreeNode bst = TreeFunctions.generateBST();
		boolean a2 = Q4_5_ValidateBST.validateBST(bst);
		System.out.println("Answer (true): " + a2);
	}
}
