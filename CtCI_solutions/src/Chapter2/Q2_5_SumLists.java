package Chapter2;

import java.util.Stack;

import Commons.ListFunctions;
import Commons.Node;

public class Q2_5_SumLists {

	
	/**
	 * 	.    .    .    .    .
	 *  7 -> 1 -> 6 -> 9 -> null
	 *  .    .    .    .
	 *  5 -> 9 -> 9 -> null
	 *  
	 *  
	 *  carry = 0
	 *  newDigit = 1
	 *  
	 *  .    .    .    .    .    .
	 * 	0 -> 2 -> 1 -> 6 -> 0 -> 1 ->
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Node list1 = new Node(new int [] {7, 1, 6, 9});
		Node list2 = new Node(new int [] {5, 9, 9});
		
		ListFunctions.printList(sumReverseList(list1, list2));
		System.out.println("---------------------------");
		
		Node list3 = new Node(new int [] {7, 1, 6});
		Node list4 = new Node(new int [] {5, 9, 2});
		
		ListFunctions.printList(sumReverseList(list3, list4));
		System.out.println("---------------------------");
		
		Node list5 = new Node(new int [] {7});
		Node list6 = new Node(new int [] {0, 0, 1, 1, 2});
		
		ListFunctions.printList(sumReverseList(list5, list6));
		System.out.println("---------------------------");
		
		System.out.println("\n------------ FOLLOW UP ---------------");
		System.out.println("--------------------------------------\n");
		
		Node list7 = new Node(new int [] {6, 1, 7, 9});
		Node list8 = new Node(new int [] {2, 9, 5});
		
		ListFunctions.printList(sumForwardList(list7, list8));
		System.out.println("---------------------------");
		
		Node list9 = new Node(new int [] {6, 1, 7});
		Node list10 = new Node(new int [] {2, 9, 5});
		
		ListFunctions.printList(sumForwardList(list9, list10));
		System.out.println("---------------------------");
		
		Node list11 = new Node(new int [] {6, 9, 6});
		Node list12 = new Node(new int [] {2, 9, 3, 3, 3});
		
		ListFunctions.printList(sumForwardList(list11, list12));
		System.out.println("---------------------------");
		
	}
	
	public static Node sumReverseList(Node l1, Node l2) {
		
		int carry = 0;
		int newDigit = 0;
		
		Node resultList = new Node(0);
		Node resultTail = resultList;
		
		while(l1 != null || l2 != null || carry != 0) {
			
			if(l1 != null) {
				carry += l1.data; 
				l1 = l1.next;
			}
			if(l2 != null) {
				carry += l2.data;
				l2 = l2.next;
			}
			
			newDigit = carry % 10; 
			carry = carry / 10; 
			
			resultTail.next = new Node(newDigit);
			resultTail = resultTail.next;
		}
		
		return resultList.next;
	}
	
	/**
	 * 	.
	 *  6 -> 1 -> 7 -> 9 -> null
	 *  .   
	 *  2 -> 9 -> 5 -> null
	 *  
	 *  
	 *  Stack1 [6  ]
	 *  Stack2 []
	 *  
	 *  carry = 0
	 *  newDigit = 6
	 *  
	 * 	6 -> 4 -> 7 -> 4
	 *  
	 *  .       .      .     .      .
	 *  6 ->   4 ->  7 -> 4 -> null
	 * 
	 * */
	
	public static Node sumForwardList(Node l1, Node l2) {
		
		Stack<Integer> stack1 = linkedListInStack(l1);
		Stack<Integer> stack2 = linkedListInStack(l2);
		
		int carry = 0;
		int newDigit = 0;
		
		Node resultList = null;
		
		while((!stack1.isEmpty()) || (!stack2.isEmpty()) || carry!= 0) {
			
			if(!stack1.isEmpty()) {
				carry += stack1.pop();
			}
			if(!stack2.isEmpty()) {
				carry += stack2.pop();
			}
			
			newDigit = carry % 10; 
			carry = carry / 10; 
			
			Node n = new Node(newDigit);
			n.next = resultList;
			resultList = n;
		}
		
		return resultList;
	}
	
	public static Stack<Integer> linkedListInStack(Node n){
		Stack<Integer> stack = new Stack<>();
		
		while(n != null) {
			stack.add(n.data);
			n = n.next;
		}
		return stack;
	}
}
