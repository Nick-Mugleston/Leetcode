
public class P0061 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		System.out.println(rotateRight(head, 1004));
	}

	public static ListNode rotateRight(ListNode head, int k) {
		if(head == null)
			return null;
		
		int len = 1;
		ListNode tail = head;
		while(tail.next != null) {
			tail = tail.next;
			len++;
		}
		
		tail.next = head;
		
		k = len - k%len - 1;
		tail.next = head;
		ListNode prop = head;
		while(k-- > 0) {
			prop = prop.next;
		}
		head = prop.next;
		prop.next = null;
		
		return head;
    }
}
