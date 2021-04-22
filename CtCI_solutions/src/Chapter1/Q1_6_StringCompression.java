package Chapter1;

public class Q1_6_StringCompression {
	
	/*
	 * 
	 * input: [a a b c c c c c a a c]
	 * 
	 * current = 0, 1, 2 ...
	 * next = 1, 2, 3 ...
	 * countChar = ++ until a[current] != a[next]
	 * 
	 * output: a2b1c5a3
	 *
	 * */
	
	public static void main(String[] args) {
		System.out.println(stringCompression("aabcccccaaa"));
		System.out.println("---------------------------");
		System.out.println(stringCompression("aabcccccaac"));
		System.out.println("---------------------------");
		System.out.println(stringCompression("aabcccccaacc"));
		System.out.println("---------------------------");
		System.out.println(stringCompression("ivan"));
		System.out.println("---------------------------");
		System.out.println(stringCompression("iiivAnnn"));
		System.out.println("---------------------------");
		System.out.println(stringCompression("iiivvvAnnnnns"));
		System.out.println("---------------------------");
	}
	public static String stringCompression(String word) {
		
		int countChar=0;
		int current = 0;
		int next = 1;
		StringBuilder newWord = new StringBuilder();
		
		for(next=1; next<word.length(); next++, current++) {
			
			if(word.charAt(current) == word.charAt(next)) {
				countChar++;
			}else {
				newWord.append(word.charAt(current)).append(countChar + 1 );
				countChar = 0;
			}
		}
		
		if(word.charAt(current) == word.charAt(current - 1)) {
			newWord.append(word.charAt(current)).append(countChar + 1 );
		}else {
			newWord.append(word.charAt(current)).append( 1 );
		}
		return newWord.length() < word.length() ? newWord.toString(): word;
	}
	

}
