package Chapter4;

import Commons.TreeFunctions;

public class Q4_11_RandomNode_Test {

	public static void main(String[] args) {
		
		Q4_11_RandomNode q11 = new Q4_11_RandomNode();
		
		q11.insert(2);
		q11.insert(1);
		q11.insert(10);
		q11.insert(5);
		q11.insert(3);
		q11.insert(6);
		
		System.out.print("Tree: ");
		TreeFunctions.printPreOrder(q11.root);
		System.out.println();
		
		q11.delete(6);
		q11.delete(11);
		q11.delete(2);
		
		System.out.print("Tree: ");
		TreeFunctions.printPreOrder(q11.root);
		System.out.println();
		
		System.out.println("Random Node: " + q11.getRandomNode().value);
	}
}
