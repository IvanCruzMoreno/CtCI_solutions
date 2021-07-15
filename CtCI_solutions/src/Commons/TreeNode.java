package Commons;

public class TreeNode {

	public int value;
	public TreeNode left = null;
	public TreeNode right = null;
	public TreeNode parent = null;
	 
	public TreeNode(int value) {
		this.value = value;
	}

	public void addLeftChild(int data) {
        TreeNode node = new TreeNode(data);
        left = node;
        node.parent = this;
    }

    
    public void addRightChild(int data) {
        TreeNode node = new TreeNode(data);
        right = node;
        node.parent = this;
    }
}
