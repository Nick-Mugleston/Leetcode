public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
   }
    
    public String getList() {
    	ListNode prop = this;
    	String toRet = "";
    	while(prop != null) {
    		toRet += prop.val+"-";
    		prop = prop.next;
    	}
    	return toRet;
    }
}
