package Chapter1;

public class Q1_3_URLify {

	public static void main(String[] args) {
		
		char [] word = new char [20];
		word[0] = 'i';
		word[1] = 'v';
		word[2] = 'a';
		word[3] = 'n';
		word[4] = ' ';
		word[5] = 's';
		word[6] = 'i';
		word[7] = 'n';
		word[8] = ' ';
		word = replaceUrl(word, 9);
		System.out.println(word);
	}
	
	
	public static char[] replaceUrl(char [] word, int trueLength) {
		
		int spaces = 0;
		int extraLength;

		for(int i=0 ; i < trueLength; i++) {
			if(word[i] == ' ') {
				spaces++; 
			}
		}
		extraLength = trueLength + spaces * 2; // %20 we already have the space of % so we only need 2
		
		for(int i= trueLength -1; i>=0; i--) {
			
			if(word[i] == ' ') {
				word[extraLength - 1] = '0';
				word[extraLength - 2] = '2';
				word[extraLength - 3] = '%';
				
				extraLength -=3;
			}else {
				word[extraLength - 1] = word[i];
				extraLength--;
			}
		}
		
		return word;
	}
}

