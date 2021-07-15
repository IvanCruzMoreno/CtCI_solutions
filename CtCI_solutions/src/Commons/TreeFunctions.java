package Commons;

public class TreeFunctions {

	public static void printPreOrder(TreeNode node) {
        if (node != null) {
        	System.out.print(node.value + " ");
        	printPreOrder(node.left);
        	printPreOrder(node.right);
        }
    }
	
	public static TreeNode generateBinaryTree() {
		TreeNode root = new TreeNode(4);
		
		root.addLeftChild(222);
		root.addRightChild(10);
		
		root.left.addLeftChild(999);
		root.left.addRightChild(3);
		
		root.right.addLeftChild(-6);
		root.right.addRightChild(1);
		
		root.right.right.addLeftChild(666);
		
		return root;
	}
}
