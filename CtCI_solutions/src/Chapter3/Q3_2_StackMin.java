package Chapter3;

import java.util.Stack;

public class Q3_2_StackMin {

	/*	
	 * 
	 * [-6 ]
	 *  [1	]	 		[ ]	 
	 * 	[666]			[ ]
	 *  [15	]			[ ]
	 * 	[-12]			[ ]
	 * 	[-6	]			[-12]
	 *  [10	]			[-6]
	 *  [5	]			[5]
	 * Stack 	Stack min
	 * 
	 * input: 5, 10, -6 , -12, 15, 666, 1, -6
	 * 
	 * 
	 * */
	
	private Stack<Integer> stack;
	private Stack<Integer> stackMin;
	
	public Q3_2_StackMin() {
		stack = new Stack<>();
		stackMin = new Stack<>();
	}
	
	public int getMin() {
		return stackMin.peek();
	}
	
	public void push(int val) {
		if(stackMin.isEmpty() || val <= stackMin.peek()) {
			stackMin.add(val);
		}
		stack.add(val);
	}
	
	public int pop() {
		
		int peekValue = stack.pop();
		
		if(stackMin.peek() == peekValue) {
			stackMin.pop();
		}
		return peekValue;
	}
	public int peek() {
		return stack.peek();
	}
}
