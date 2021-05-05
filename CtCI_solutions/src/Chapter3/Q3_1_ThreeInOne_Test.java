package Chapter3;

public class Q3_1_ThreeInOne_Test {

	public static void main(String[] args) {
		
		 Q3_1_ThreeInOne stack = new Q3_1_ThreeInOne(9);
		 
		 stack.push(1, 1);
		 stack.push(2, 1);
		 stack.push(3, 1);
		 stack.push(4, 2);
		 stack.push(5, 2);
		 stack.push(6, 2);
		 stack.push(7, 3);
		 stack.push(8, 3);
		 stack.push(9, 3);
		 
		 stack.print();
		 
	}
	

}
