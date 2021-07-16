package Chapter3;

import java.util.Stack;

public class Q3_5_SortStack_Test {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.add(10);
		stack.add(1);
		stack.add(-5);
		stack.add(2);
		stack.add(1);
		stack.add(-8);
		
		stack = Q3_5_SortStack.sortStack(stack);
		
		stack.forEach(System.out::println);
	}
}
