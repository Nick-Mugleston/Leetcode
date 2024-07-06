
public class P0160 {

	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		headA.next = new ListNode(2);
		headA.next.next = new ListNode(3);
		ListNode joint = new ListNode(6);
		joint.next = new ListNode(6);
		headA.next.next.next = joint;
		ListNode headB = new ListNode(1);
		headB.next = joint;
		
		
		System.out.println(getIntersectionNode(headA, headB).val);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null)
			return null;
		
		ListNode pointerA = headA;
		ListNode pointerB = headB;
		
		while(pointerA != pointerB) {
			pointerA = pointerA == null? headB: pointerA.next;
			pointerB = pointerB == null? headA: pointerB.next;
		}
		
		return pointerA;
    }
}
