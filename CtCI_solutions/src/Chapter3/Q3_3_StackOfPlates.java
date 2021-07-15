package Chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q3_3_StackOfPlates {

	/*
	 *
	 * 
	 *                 4
	 *                 3
	 *  listStacks = [ 2 , 5   ,   ]
	 *  			
	 *  
	 *  
	 *  
	 * */
	
	private int bound;
	private List<Stack<Integer>> listStacks;
	
	public Q3_3_StackOfPlates(int bound) {
		this.bound = bound;
		listStacks = new ArrayList<>();
	}
	
	public int getIndex() {
		return listStacks.size()-1;
	}
	
	public Stack<Integer> getCurrrentStack() {
		if (listStacks.isEmpty()) {
			return null;
		}
		
		int index = getIndex();
		return  listStacks.get(index);
	}
	
	public void push(int value) {
	
		Stack<Integer> currentStack = getCurrrentStack();
		
		if(currentStack == null || currentStack.size() == bound) {
			Stack<Integer> newStack = new Stack<>();
			newStack.add(value);
			listStacks.add(newStack);	
		}else {
			currentStack.add(value);
		}
		
	}
	
	public int pop() throws Exception {
		Stack<Integer> currentStack = getCurrrentStack();
		
		if(currentStack == null) {
			throw new Exception("There are not values");
		}
		
		int value = currentStack.pop();
		
		if(currentStack.isEmpty()) {
			listStacks.remove(currentStack);
		}
		return value;
	}
	
	public int peek() throws Exception {
		Stack<Integer> currentStack = getCurrrentStack();
		
		if(currentStack == null) {
			throw new Exception("There aren't values");
		}
		
		return currentStack.peek();
	}
}
