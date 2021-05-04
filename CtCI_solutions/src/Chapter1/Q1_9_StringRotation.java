package Chapter1;

public class Q1_9_StringRotation {

	/*
	 * 
	 * input 
	 * 
	 * s1 = ivanmoreno 
	 * s2 = anmorenoiv |->  [anmorenoiv][anmorenoiv]
	 * 
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		System.out.println(isARotation("ivanmoreno", "anmorenoiv"));
		System.out.println("---------------------------");
		
		System.out.println(isARotation("ivanmoreno", ""));
		System.out.println("---------------------------");
		
		System.out.println(isARotation("ivanmoreno", "anmorenoivan"));
		System.out.println("---------------------------");
		
		System.out.println(isARotation("waterbottle", "erbottlewat"));
	}
	
	public static boolean isARotation(String s1, String s2) {
		
		String doubleS2 = s2 + s2;
		return doubleS2.contains(s1);
	}
}
