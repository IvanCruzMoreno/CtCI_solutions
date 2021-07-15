package Chapter4;

import java.util.List;

import Commons.TreeFunctions;
import Commons.TreeNode;

public class Q4_3_ListOfDepths_Test {

	/*
	 * 	
	 *  Input: 
	 *                       (4)
	 *                     /      \
	 *                 (222)        (10)
	 *                /     \     /      \
	 *             (999)    (3) (-6)      (1)
	 *                                   /
	 *                                (666)
	 *                                
	 */
	
	public static void main(String[] args) {
	
		Q4_3_ListOfDepths list = new Q4_3_ListOfDepths();
		
		TreeNode root = TreeFunctions.generateBinaryTree();
		
		List<List<Integer>> lists = list.listOfDepths(root);
		
		for (int i = 0; i < lists.size(); i++) {
            List<Integer> subList = lists.get(i);
            System.out.print("\nLevel "+  i + " : ");
            for (Integer num : subList) {
                System.out.print(num + " ");
            }
        }
	}
	
}
