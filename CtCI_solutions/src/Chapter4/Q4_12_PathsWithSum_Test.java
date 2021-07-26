package Chapter4;

import Commons.TreeFunctions;
import Commons.TreeNode;

public class Q4_12_PathsWithSum_Test {

	public static void main(String[] args) {
		
		TreeNode root = TreeFunctions.generateTree();
		
		System.out.println(Q4_12_PathsWithSum.pathsWithSum(root, 5));
	}
}
