package Chapter1;

public class Q1_7_RotateMatrix {

	
	/*
	 * N x N matrix
	 * 
	 * input: 
	 * 
	 * [ 1, 1, 1, 1]  temp = 1, 2
	 * [ 2, 2, 2, 1]
	 * [ 3, 3, 3, 3]
	 * [ 4, 4, 4, 4]
	 * 
	 * output:
	 * 
	 * 1) step
	 * 
	 * temp = a[i][j]
	 * a[i][j] = a[j][i]
	 * a[j][i] = temp
	 *  
	 * [ \, 2, 3, 4]
	 * [ 1, \, 3, 4]
	 * [ 1, 2, \, 4]
	 * [ 1, 2, 3, \]
	 * 
	 * 2) step
	 * 
	 * j/2
	 * pointer = a.length - 1
	 * pointer-- 
	 * [ 4, 3| 2, 1]
	 * [ 4, 3| 2, 1]
	 * [ 4, 3| 2, 1]
	 * [ 4, 3| 2, 1]
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		
		int [][] matrix = {{1,1,1,1},
						   {2,2,2,2},
						   {3,3,3,3},
						   {4,4,4,4}};
		
		int [][] matrix2 = {{1,1,1},
						    {2,2,2},
						    {3,3,3}};
		
		int [][] matrix3 = {{1,1},
						    {2,2}};
		
		int [][] matrix4 = {{1,1,1,1,1},
						   {2,2,2,2,2},
						   {3,3,3,3,3},
						   {4,4,4,4,4},
						   {5,5,5,5,5}};
		
		rotateMatrix(matrix);
		printMatrix(matrix);
		
		System.out.println("---------------------------");
		rotateMatrix(matrix2);
		printMatrix(matrix2);
		
		System.out.println("---------------------------");
		rotateMatrix(matrix3);
		printMatrix(matrix3);
		
		System.out.println("---------------------------");
		rotateMatrix(matrix4);
		printMatrix(matrix4);
	}
	
	public static int[][] rotateMatrix(int [][] matrix){
		
		if(matrix.length != matrix[0].length) {
			return null;
		}
		matrix = inverseMatrix(matrix);
		return flodMatrix(matrix);
	}
	
	public static int[][] inverseMatrix(int [][] matrix){
		
		int temp = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = i; j < matrix[0].length; j++) {
				
				if(i != j) {
					temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
				    matrix[j][i] = temp;
				}
			}
		}
		return matrix;
	}
	
	public static int[][] flodMatrix(int[][] matrix){
		
		int pointer = 0;
		int temp = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			
			pointer = matrix[0].length - 1; // 3
			
			for(int j = 0; j < matrix[0].length / 2; j++) {
				
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][pointer];
				matrix[i][pointer] = temp;
				pointer--;
			}
		}
		return matrix;
	}
	
	public static void printMatrix(int [][] matrix) {
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
