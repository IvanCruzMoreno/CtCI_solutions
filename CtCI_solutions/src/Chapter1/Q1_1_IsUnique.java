package Chapter1;


public class Q1_1_IsUnique {

	public static void main(String[] args) {
		
		System.out.println(isUniqueCharacter("ivan"));
		System.out.println("---------------------------");
		
		System.out.println(isUniqueCharacter("ivansin"));
		System.out.println("---------------------------");
		
		System.out.println(isUniqueCharacter("ivansinbad"));
		System.out.println("---------------------------");
		
		System.out.println(isUniqueCharacter("abcdefg"));
		System.out.println("---------------------------");
		
		System.out.println(isUniqueCharacter("aaaaaaaaaaaa"));
	}
	
	public static boolean isUniqueCharacter(String s) {
		
		int[] asciiChar = new int[128];
		int letter;
	
		for(int i = 0; i<s.length(); i++) {
			letter = s.charAt(i);
			
			if(asciiChar[letter] == 1) {
				return false;
			}else {
				asciiChar[letter] = 1;
			}
			
		}
		return true;
	}
}
