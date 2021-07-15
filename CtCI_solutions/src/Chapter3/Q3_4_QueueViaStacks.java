package Chapter3;

import java.util.Stack;

public class Q3_4_QueueViaStacks {

	/*
	 * [ ]
	 * [ ]
	 * [ ]
	 * [ ]
	 * [ ]
	 * queue  
	 *   |
	 *   |
	 *   V
	 * 
	 * input : 10, -8, 1, 3, 999
	 * 
	 * [ ]       [ ]
	 * [ ]       [ ]
	 * [ ]       [ ]
	 * [3]      []
	 * [1]      [-8]
	 * s1        s2
	 * 
	 * 
	 * */
	private Stack<Integer> enqueue;
	private Stack<Integer> dequeue;
	
	public Q3_4_QueueViaStacks() {
		this.dequeue = new Stack<>();
		this.enqueue = new Stack<>();
	}
	
	public void add(int value) {
		enqueue.add(value);
	}
	
	private void swap() {
		while(!enqueue.isEmpty()) {
			dequeue.add(enqueue.pop());
		}
	}
	
	public Integer remove() {
		if(isEmpty()) {
			return null;
		}
		if(dequeue.isEmpty()) {
			swap();
		}
		return dequeue.pop();
	}
	
	public Integer peek() {
		if(isEmpty()) {
			return null;
		}
		if(dequeue.isEmpty()) {
			swap();
		}
		return dequeue.peek();
	}
	
	public boolean isEmpty() {
		return enqueue.isEmpty() && dequeue.isEmpty();
	}
}
