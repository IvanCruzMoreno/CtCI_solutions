package Chapter2;

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
}
