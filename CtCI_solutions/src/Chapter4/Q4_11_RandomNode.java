package Chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import Commons.TreeNode;

public class Q4_11_RandomNode {

	/*
	 * input: 2, 1, 10, 5, 3, 6
	 * 
	 *                    2
	 *                   / \
	 *                  1   10
	 *                     /
	 *                    5
	 *                   / \
	 *                  3   6
	 * 
	 * */
	
	private List<TreeNode> nodes;
	TreeNode root;
	
	public Q4_11_RandomNode() {
		nodes = new ArrayList<>();
		root = null;
	}
	
	public void insert(int value) {
		
		if(root == null) {
			root = new TreeNode(value);
			nodes.add(root);
			return;
		}
		TreeNode aux = root;
		insertAux(aux, value);
	}
	
	private void insertAux(TreeNode n, int value) {
		
		if(value <= n.value) {
			
			if(n.left == null) {
				TreeNode newNode = new TreeNode(value);
				n.left = newNode;
				
				nodes.add(newNode);
			}else {
				insertAux(n.left, value);
			}
			
		}else {
			
			if(n.right == null) {
				TreeNode newNode = new TreeNode(value);
				n.right = newNode;
				
				nodes.add(newNode);
			}else {
				insertAux(n.right, value);
			}
			
		}
	}
	
	public TreeNode find(int value) {
		
		TreeNode aux = root;
		aux = findAux(aux, value);
		
		return aux;
	}
	
	private TreeNode findAux(TreeNode n, int value) {
		
		if(n == null) {
			return null;
		}
		
		if(value < n.value) {
			n = findAux(n.left, value);
		}else if (value > n.value) {
			n = findAux(n.right, value);
		}
		
		return n;
	}
	
	public void delete(int value) {
		TreeNode aux = root;
		
		nodes = nodes.stream().filter(node -> node.value != value).collect(Collectors.toList());
		
		aux = deleteAux(aux, value);
		
	}
	
	private TreeNode deleteAux(TreeNode n, int value) {
		
		if(n == null) {
			return null;
		}
		
		if(value < n.value) {
			n.left = deleteAux(n.left, value);
		}else if (value > n.value) {
			n.right = deleteAux(n.right, value);
		}else {
		
			if(n.left == null) {
				return n.right;
			}
			if(n.right == null) {
				return n.left;
			}
			TreeNode aux = getMostLeft(n.right);
			n.value = aux.value;
			
			deleteAux(n.right, n.value);
		}
		
		return n;
			
	}
	
	private TreeNode getMostLeft(TreeNode n) {
		while(n.left != null) {
			n = n.left;
		}
		return n;
	}
	
	public TreeNode getRandomNode() {
		Random random = new Random();
		int numRandom = random.nextInt(nodes.size()-1);
		
		return nodes.get(numRandom);
	}
	
}
