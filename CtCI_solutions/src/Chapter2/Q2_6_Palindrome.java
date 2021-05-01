package Chapter2;

import Commons.Node;

public class Q2_6_Palindrome {
	
	/*         
	 * list1 = 1 -> 2 -> 1
	 * 				.    .
	 * reverse = null <- 1 <- 2 <- 1
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
			
			Node list1 = new Node(new int [] {1, 2, 1});
			Node list2 = new Node(new int[] { 1, 2, 3, 4 });
			Node list3 = new Node(new int[] { 1, 2, 3, 4, 3, 2, 1 });
			Node list4 = new Node(new int[] { 1, 2, 2, 1, 6, 2, 1 });
			Node list5 = new Node(new int[] { 2, 1, 1, 2 });
			
			System.out.println(isPalindrome(list1));
			System.out.println("---------------------------");
			
			System.out.println(isPalindrome(list2));
			System.out.println("---------------------------");
			
			System.out.println(isPalindrome(list3));
			System.out.println("---------------------------");
			
			System.out.println(isPalindrome(list4));
			System.out.println("---------------------------");
			
			System.out.println(isPalindrome(list5));
			System.out.println("---------------------------");
			
			
	}
	public static boolean isPalindrome(Node list) {
		
		
		Node reverseList = reverseList(list);
		
		while(list != null) {
			if(list.data != reverseList.data) {
				return false;
			}
			list = list.next;
			reverseList = reverseList.next;
		}
		return true;
	}
	
	public static Node reverseList(Node n) {
		
		Node head = null;
		
		while(n != null) {
			Node newNode = new Node(n.data);
			newNode.next = head;
			head = newNode;
			n = n.next;
		}
		return head;
	}

}
