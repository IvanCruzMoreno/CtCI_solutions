package Chapter1;

import java.util.ArrayList;
import java.util.List;


public class Q1_4_PalindromePermutation {
	
	/*	tact coa
	 * 	[t a c t c o a]
	 * 	[1 1 1 2 2 1 2]
	 * 
	 * evenNum = [1, 2, 3, 2, 1, 2, 1] -> 1 (good)
	 * 
	 * ivavia
	 * 	[i v a v i a]
	 * 	[1 1 1 2 2 2]
	 * 
	 * evenNum = [1 2 3 2 1 0] -> 0 (good)
	 * 
	 * ivanav
	 * [i v a n v a]
	 * [1 1 1 1 2 2]
	 * 
	 * evenNum = [1 2 3 4 3 2] -> 2 (bad)
	 *  
	 *  only it can have 1 odd number if it's length is odd
	 *  and 0 if it's length is even  
	 * */
	public static void main(String[] args) {
		System.out.println(isPalinPermutation("tact coa"));
		System.out.println("---------------------------");
		
		System.out.println(isPalinPermutation("iva via"));
		System.out.println("---------------------------");
		
		System.out.println(isPalinPermutation("ivana v"));
		System.out.println("---------------------------");
		
		System.out.println(isPalinPermutation("bad"));
		System.out.println("---------------------------");
	}
	public static boolean isPalinPermutation(String word) {
		
		word = word.toLowerCase().replace(" ", "");
		int evenNum = 0;
		int ascii [] = new int [255];
			
		for(int i=0; i< word.length(); i++) {
		
			ascii[word.charAt(i)] +=1;
			if (ascii[word.charAt(i)] %2 == 0) {
				evenNum--;
			}else {
				evenNum++;
			}
		}
		return evenNum <= 1;
	}
}
