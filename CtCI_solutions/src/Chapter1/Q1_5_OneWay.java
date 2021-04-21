package Chapter1;

public class Q1_5_OneWay {

	
	/*
	 * 
	 * insert / remove / replace
	 * 
	 * p l e, p a l e -> true
	 * 
	 * pales, pale -> true
	 * 
	 * ivena, iven -> true
	 * 
	 * i v a n, u v h n -> false
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println(isEdited("ple", "pale"));
		System.out.println("---------------------------");
		System.out.println(isEdited("pales", "pale"));
		System.out.println("---------------------------");
		System.out.println(isEdited("ivena", "iven"));
		System.out.println("---------------------------");
		System.out.println(isEdited("ivan", "uvhn"));
		System.out.println("---------------------------");
		System.out.println(isEdited("sinb", "sunv"));
		System.out.println("---------------------------");
		System.out.println(isEdited("sunvffffffffffffffffff", "sunv"));
		System.out.println("---------------------------");
		System.out.println(isEdited("sunvii", "sunv"));
		
		
		
	}
	
	public static boolean isEdited(String s1, String s2) {
		
		
		int i=0,j=0;
		String min = s1.length() < s2.length() ? s1 : s2;
		String max = s1.length() < s2.length() ? s2 : s1;
		
		if(max.length() - min.length() > 1) {
			return false;
		}
		
		int flag = 0;
		while(i < max.length() && j < min.length() && flag <= 1) {
			
			if(max.charAt(i) == min.charAt(j)) {
				i++;
				j++;
			}else {
			
				if(max.length() == min.length()) {
					i++;
					j++;
				}else {
					i++;
				}
					flag++;
				
			}
			
		}
		
		
		return flag <= 1 ? true: false;
	}
	
	public static int getMaxLength(String s1, String s2) {
		int lengthS1 = s1.length();
		int lengthS2 = s2.length();
		
		return lengthS1 < lengthS2 ? lengthS2 : lengthS1;
	}
}
