package Chapter2;

import Commons.ListFunctions;
import Commons.Node;

public class Q2_3_DeleteMiddleNode {

	
	/*input:
	 *          head => delete
	 * 			 |	
	 * a -> b -> c -> d -> e -> f
	 * 
	 * 1) a -> b -> d -> d -> e -> f
	 * 2) a -> b -> d -> e -> f
	 * 
	 * 1) n.data = n.next.data;
	 * 2) n.next = n.next.next;
	 * 
	 * output:
	 * a -> b -> d -> e -> f
	 *  
	 * */
	public static void main(String[] args) {
		Node list1 = new Node(new int [] {1, 2, 3, 4, 5, 6});
		Node list2 = new Node(new int [] {1, 2, 3, 4, 5, 6, 6, 6, 1});
		Node list3 = new Node(new int [] {1, 2, 3, 3, 3});
		
		ListFunctions.printList(list1);
		deleteThisNode(list1.next.next); 				// 3
		ListFunctions.printList(list1);
		
		System.out.println("---------------------------");
		
		ListFunctions.printList(list2);
		deleteThisNode(list2.next.next.next.next.next); // 6
		ListFunctions.printList(list2);
		
		System.out.println("---------------------------");
		
		ListFunctions.printList(list3);
		deleteThisNode(list3); 							// 1
		ListFunctions.printList(list3);
		
		System.out.println("---------------------------");
	}
	public static boolean deleteThisNode(Node n) {
		if(n == null || n.next == null) {
			return false;
		}
		n.data = n.next.data;
		n.next = n.next.next;
		return true;
	}
}
