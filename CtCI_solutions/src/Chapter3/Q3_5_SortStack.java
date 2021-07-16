package Chapter3;

import java.util.Stack;

public class Q3_5_SortStack {

	/*
	 * 
	 * 
	 * 
	 * [ ]             [ ]
	 * [ ]            [ ]
	 * []             [-8]
	 * []             [-5]
	 * []            [1]
	 * []            [2]
	 * S1              S2
	 * 
	 * while s1.isNotEmpty
	 *     temp = s1.pop() //10
	 *     
	 *     if s2.isEmpty || temp <= s2.peek()
	 *        s2.add(temp)
	 *     else
	 *        while s2.isNotEmpty && temp > s2.peek()
	 *              s1.add(s2.pop())
	 *        s2.add(temp)
	 *      
	 * */
	
	public static Stack<Integer> sortStack(Stack<Integer> stack){
		
		Stack<Integer> auxStack = new Stack<>();
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			
			if(auxStack.isEmpty() || temp <= auxStack.peek()) {
				auxStack.add(temp);
			}else {
				while(!auxStack.isEmpty() && temp > auxStack.peek()) {
					stack.add(auxStack.pop());
				}
				auxStack.add(temp);
			}
		}
		
		return reverseStack(auxStack);
	}
	
	private static Stack<Integer> reverseStack(Stack<Integer> stack){
		Stack<Integer> aux = new Stack<>();
		
		while(!stack.isEmpty()) {
			aux.add(stack.pop());
		}
		
		return aux;
	}
}
