package Chapter3;

public class Q3_4_QueueViaStacks_Test {

	public static void main(String[] args) {
		
		/*
		 * input : 10, -8, 1, 3, 999
		 * 
		 * */
		
		Q3_4_QueueViaStacks queue = new Q3_4_QueueViaStacks();
		
		queue.add(10);
		queue.add(-8);
		
		System.out.println("Peek: " + queue.peek());
		System.out.println("Remove: " + queue.remove());
		System.out.println("Remove: " + queue.remove());
		System.out.println("Remove: " + queue.remove());
		
		queue.add(1);
		queue.add(3);
		queue.add(999);
		
		System.out.println("Peek: " + queue.peek());
		System.out.println("Remove: " + queue.remove());
		System.out.println("Peek: " + queue.peek());
	}
}
