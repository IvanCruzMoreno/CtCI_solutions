package Chapter1;

public class Q1_2_CheckPermutation {

	public static void main(String[] args) {
		
		System.out.println(isAPermutation("ivan", "nvai"));
		System.out.println("---------------------------");
		
		System.out.println(isAPermutation("ivansin", "sinnba"));
		System.out.println("---------------------------");
		
		System.out.println(isAPermutation("ivansinb", "ivansinb"));
		System.out.println("---------------------------");
		
		System.out.println(isAPermutation("abcdefg", "gfedcba"));
		System.out.println("---------------------------");
		
		System.out.println(isAPermutation("aaaaaaaaaaaa", "aaaaaaaaaaar"));
	}
	
	public static boolean isAPermutation(String s1, String s2) {
		
		int [] vocabularyS1 = new int [128]; 
		int letter;
		
		if(s1.length() == s2.length()) {
			
			for(int i=0; i < s1.length(); i++) {
				
				letter = s1.charAt(i);
				vocabularyS1[letter] += 1;
			}
			
			for(int i=0; i < s2.length(); i++) {
				
				letter = s2.charAt(i);
				if(vocabularyS1[letter] <= 0) {
					return false;
				}else {
					vocabularyS1[letter] -= 1;
				}
			}
			return true;
		}
		
		return false;
	}
}
