package Chapter4;

import java.util.HashMap;
import java.util.Map;

import Commons.TreeNode;

public class Q4_12_PathsWithSum {

	/*
	 *                   5
	 *                 /   \
	 *              -10      1
	 *              /  \    /  \
	 *            18   -4  -1   80
	 *           /  \  / \ / \ /  \                     objective = 5
	 * 			5  -8 1  2 4  3 2  7
	 * 
	 * 
	 *  combinations = (0,1), (5, 1), (-5, 1)
	 *  
	 *  -------  (int sum,TreeNode n, int obj, Map comb)
	 *   
	 *    if n == null 
	 *       return 0
	 *    
	 *    sum+ = n.value // 5
	 *    
	 *    int paths = 0
	 *    
	 *    paths+= comb.getOrDefault(sum-obj, 0);   // 1
	 *    comb.merge(sum, 1, Integer::sum);
	 *    
	 *    paths+= function(sum, n.left, comb)
	 *    paths+= function(sum, n.right, comb)
	 *    
	 *    comb.merge(sum, -1, Integer::sum);
	 *    
	 *    if comb.get(sum) == 0
	 *        comb.remove(sum);
	 *    
	 *    
	 *    return path;
	 * 
	 * */
	
	public static int pathsWithSum(TreeNode root, int obj) {
		Map<Integer, Integer> comb = new HashMap<>();
		comb.put(0, 1);
		
		return getPaths(0, root, obj, comb);
	}
	
	private static int getPaths(int sum, TreeNode n, int obj, Map<Integer, Integer> comb) {
		
		if(n == null) {
			return 0;
		}
		
		sum+= n.value;
		
		int paths = 0;
		
		paths+= comb.getOrDefault(sum-obj, 0);
		
		comb.merge(sum, 1, Integer::sum);
		
		paths+= getPaths(sum, n.left, obj, comb);
		paths+= getPaths(sum, n.right, obj, comb);
		
		comb.merge(sum, -1, Integer::sum);
		
		if(comb.get(sum) == 0) {
			comb.remove(sum);
		}
		
		return paths;
	}
}
