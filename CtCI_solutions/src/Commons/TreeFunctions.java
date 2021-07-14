package Commons;

public class TreeFunctions {

	public static void printPreOrder(TreeNode node) {
        if (node != null) {
        	System.out.print(node.value + " ");
        	printPreOrder(node.left);
        	printPreOrder(node.right);
        }
    }
}
