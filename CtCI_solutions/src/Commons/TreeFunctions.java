package Commons;

public class TreeFunctions {

	public static void printPreOrder(TreeNode node) {
        if (node != null) {
        	System.out.print(node.value + " ");
        	printPreOrder(node.left);
        	printPreOrder(node.right);
        }
    }
	/*
	 * 	
	 *   
	 *                       (4)
	 *                     /      \
	 *                 (222)        (10)
	 *                /     \     /      \
	 *             (999)    (3) (-6)      (1)
	 *                                   /
	 *                                (666)
	 *                                
	 */
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
	public static TreeNode generateBinaryTreeNotBalanced() {
		TreeNode root = TreeFunctions.generateBinaryTree();
		
		root.left.left.addLeftChild(101);
		root.left.left.addRightChild(7);
		
		root.right.right.addRightChild(333);
		root.right.right.right.addRightChild(8);
		
		return root;
	}
	/* 
	 *                      (100) 
	 *                    /       \
	 *                 (50)     (150)
	 *                /    \     /   \
	 *             (20)    (60)(130) (163)
	 *            /     \            /    \
	 *        (10)     (30)      (154)   (165)
	 *                                          
	 */     
	public static TreeNode generateBST() {
        TreeNode root = new TreeNode(100);
		
		root.addLeftChild(50);
		root.addRightChild(150);
		
		root.left.addLeftChild(20);
		root.left.addRightChild(60);
		
		root.right.addLeftChild(130);
		root.right.addRightChild(163);
		
		root.left.left.addLeftChild(10);
		root.left.left.addRightChild(30);
		
		root.right.right.addLeftChild(154);
		root.right.right.addRightChild(165);
		
		return root;
	}
}
