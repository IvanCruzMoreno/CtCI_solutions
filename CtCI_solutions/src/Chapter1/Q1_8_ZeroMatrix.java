package Chapter1;

import java.util.HashSet;
import java.util.Set;

import Commons.MatrixFunctions;

public class Q1_8_ZeroMatrix {

	
	/*
	 * M x N matrix
	 * 
	 * M = 4
	 * N = 5
	 *  
	 * [ 1, 1, 1, 1, 0 ] 
	 * [ 2, 0, 2, 2, 2 ]
	 * [ 3, 3, 0, 3, 3 ]
	 * [ 0, 4, 4, 4, 4 ]
	 * 
	 * [ 0, 0, 0, 0, 0 ] 
	 * [ 0, 0, 0, 0, 0 ]
	 * [ 0, 0, 0, 0, 0 ]
	 * [ 0, 0, 0, 0, 0 ]
	 * 
	 * [ 0,4 | 1,2 | 2,2 | 3,0]
	 * 
	 * containsX = [ 0 1 2 3]
	 * containsY = [ 4 1 2 0]
	 * 
	 * */
	public static void main(String[] args) {
		int [][] matrix = {{1,1,1,1,1},
						   {2,0,2,2,2},
						   {3,3,3,3,3},
						   {0,4,4,4,4}};
		
		int [][] matrix2 = {{0,1,1},
						    {2,2,2},
						    {3,3,3}};

		int [][] matrix3 = {{1,1},
							{2,0}};
		
		int [][] matrix4 = {{1,1,0,1,1},
						    {2,2,2,2,2},
						    {3,3,0,3,3},
						    {4,4,4,4,4},
						    {5,5,0,5,5}};
		
		setZerosMatrix(matrix);
		MatrixFunctions.printMatrix(matrix);
		
		System.out.println("---------------------------");
		
		setZerosMatrix(matrix2);
		MatrixFunctions.printMatrix(matrix2);
		
		System.out.println("---------------------------");
		
		setZerosMatrix(matrix3);
		MatrixFunctions.printMatrix(matrix3);
		
		System.out.println("---------------------------");
		
		setZerosMatrix(matrix4);
		MatrixFunctions.printMatrix(matrix4);
		
		
	}
	
	public static int[][] setZerosMatrix(int[][] matrix){
		
		Set<Integer> ejeX = new HashSet<>();
		Set<Integer> ejeY = new HashSet<>();
		
		countZeros(matrix, ejeX, ejeY);
		
		putZerosX(matrix, ejeX);
		
		putZerosY(matrix, ejeY);
		
		return matrix;
	}

	private static void putZerosY(int[][] matrix, Set<Integer> ejeY) {
		
		for(int j = 0; j < matrix[0].length; j++) {
			if(ejeY.contains(j)) {
				for(int x = 0; x < matrix.length; x++) {
					matrix[x][j] = 0;
				}
			}
		}
		
	}

	private static void putZerosX(int[][] matrix, Set<Integer> ejeX) {
		
		for(int i = 0; i < matrix.length; i++) {
			if(ejeX.contains(i)) {
				for(int y = 0; y < matrix[0].length; y++) {
					matrix[i][y] = 0;
				}
			}
		}
		
	}

	private static void countZeros(int[][] matrix, Set<Integer> ejeX, Set<Integer> ejeY) {
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					ejeY.add(j);
					ejeX.add(i);
				}
			}
		}
		
	}
	
}
