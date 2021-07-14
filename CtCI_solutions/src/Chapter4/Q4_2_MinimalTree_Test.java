package Chapter4;

import Commons.TreeFunctions;
import Commons.TreeNode;

public class Q4_2_MinimalTree_Test {

	/*
	 * 			0  1  2  3  4  5    6    7
	 *  input: [1, 2, 3, 4, 6, 10, 100, 666]
	 *  
	 *  output:              (4)
	 *                     /      \
	 *                 (2)          (10)
	 *                /   \        /      \
	 *             (1)     (3)  (6)      (100)
	 *                                   /
	 *                                (666)
	 */
	
	public static void main(String[] args) {
		
		Q4_2_MinimalTree minimalTree = new Q4_2_MinimalTree();
		
		int sortedArray[] = {1, 2, 3, 4, 6, 10, 100, 666};
		TreeNode root = minimalTree.generateMinTree(sortedArray);
		
		TreeFunctions.printPreOrder(root);

	}
}
