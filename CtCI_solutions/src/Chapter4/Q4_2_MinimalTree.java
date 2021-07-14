package Chapter4;


import Commons.TreeNode;

public class Q4_2_MinimalTree {

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
	 *         
	 *  if(max < min) return null
	 *  
	 *  min = 0, 4   
	 *  max = 7, 7
	 *  middle = (min + max) / 2 => 3, 5
	 *  
	 *  n = array[middle]  =  (4)
	 *  
	 *  n.left => recursion(min, middle -1 , array)
	 *  n.right => recursion(middle + 1, max, array) 
	 *  
	 *       
	 * */
	
	public TreeNode generateMinTree(int array[]) {
		return generateMinTreeAux(0, array.length - 1, array);
	}
	
	private TreeNode generateMinTreeAux(int min, int max, int array[]) {
	
		if(max < min) {
			return null;
		}
		
		int middle = (min + max)/2;
		
		TreeNode n = new TreeNode(array[middle]);
		
		n.left = generateMinTreeAux(min, middle-1, array);
		n.right = generateMinTreeAux(middle+1, max, array);
		
		return n;
	}
	
}
