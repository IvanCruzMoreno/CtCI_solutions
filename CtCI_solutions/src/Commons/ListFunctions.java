package Commons;

public class ListFunctions {

	public static void printList(Node head) {
		
		if (head == null) {
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
	}
	public static int getSize(Node n) {
		int count = 0;
		while(n != null) {
			count++;
			n = n.next;
		}
		return count;
	}
}
