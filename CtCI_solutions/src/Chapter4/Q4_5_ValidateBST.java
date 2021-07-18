package Chapter4;

import Commons.TreeNode;

public class Q4_5_ValidateBST {

	/*
	 *  Input: 
	 *                    -(100)+ 
	 *                    /       \
	 *              -(50)100     (150)
	 *                /    \     /     \
	 *          - (20)50    (60) (180)   (163)
	 *            /     \               /    \
	 *        -(10)20  20(30)50      (154)   (165)
	 *          T          T                      
	 *                                        
	
         min = Integer.min
         max = Integer.max
         
         if(n == null)
              return true
         if n.value < min || n.value > max
              return false
         
         boolean left = checkBST(min, n.value, n.left)
         if(left == false)
             return false
         boolean right = checkBST(n.value, max, n.right)
         if(right == false)
             return false
             
         return true
         
            
	 */
	
	
	public static boolean validateBST(TreeNode n) {
		return checkBST(Integer.MIN_VALUE, Integer.MAX_VALUE, n);
	}
	
	private static boolean checkBST(int min, int max, TreeNode n) {
		
		if(n == null) {
			return true;
		}
		if(n.value < min || n.value > max) {
			return false;
		}
		boolean left = checkBST(min, n.value, n.left);
		if(left == false) {
			return false;
		}
		boolean right = checkBST(n.value, max, n.right);
		if(right == false) {
			return false;
		}
		
		return true;
	}
}
