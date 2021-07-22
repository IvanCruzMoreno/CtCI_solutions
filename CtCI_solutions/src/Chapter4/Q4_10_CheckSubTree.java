package Chapter4;

import Commons.TreeNode;

public class Q4_10_CheckSubTree {

	/*
	 * 	
	 *   T1:
	 *                       (4)
	 *                     /      \
	 *                 (222)        (10)
	 *                /     \     /      \
	 *             (999)    (3) (-6)      (1)
	 *                                   /
	 *                                (666)
	 *   T2:
	 *            (1)
	 *           /
	 *         (666)
	 *        
	 *        # = null
	 *        X = end node
	 *        
	 *        StringBuilder graphT1 = 
	 *          [#999#X222#3#XX4#-6#X10#666#X1#XXX]
	 *        StringBuilder graphT2 =
	 *          [#666#X1#X]
	 */
	
	public boolean checkSubTree(TreeNode T1, TreeNode T2) {
		
		StringBuffer stringT1 = new StringBuffer();
		buildStringInOrder(stringT1, T1); 
		
		StringBuffer stringT2 = new StringBuffer();
		buildStringInOrder(stringT2, T2);
		
		return stringT1.indexOf(stringT2.toString()) != -1;
	}
	
	private void buildStringInOrder(StringBuffer string, TreeNode n) {
		if(n == null) {
			string.append("#");
			return;
		}
		buildStringInOrder(string, n.left);
		string.append(n.value);
		buildStringInOrder(string, n.right);
		string.append("X");
	}
}
