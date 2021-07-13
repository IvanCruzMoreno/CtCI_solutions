package Chapter3;



public class Q3_2_StackMin2_Test {

	public static void main(String[] args) {
		
		Q3_2_StackMin stack = new Q3_2_StackMin();
		
		stack.push(5);
		stack.push(10);
		stack.push(-6);
		stack.push(-12);
		stack.push(15);
		stack.push(666);
		stack.push(1);
		stack.push(-6);
		
		System.out.println("Min: " + stack.getMin());
		System.out.println("Peek: " + stack.peek());
		System.out.println("-------------------");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Pop: "+ stack.pop());
		}
		System.out.println("-------------------");
		
		System.out.println("Min: " + stack.getMin());
		System.out.println("Peek: " + stack.peek());
	}
}
