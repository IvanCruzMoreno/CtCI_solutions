package Chapter3;

public class Q3_3_StackOfPlates_Test {

	public static void main(String[] args) throws Exception {
		
		Q3_3_StackOfPlates stackOfPlates = new Q3_3_StackOfPlates(3);
		
		stackOfPlates.push(5);
		stackOfPlates.push(10);
		stackOfPlates.push(7);
		stackOfPlates.push(4);
		
		System.out.println(stackOfPlates.peek());
		
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.pop());
		
		System.out.println(stackOfPlates.peek());
		
		System.out.println(stackOfPlates.pop());
		
		System.out.println(stackOfPlates.peek());
		
	}
}
