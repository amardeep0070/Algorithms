package linkedlistpair;

public class Solution {
	 public ListNode swapPairs(ListNode head) {
	        
	        ListNode dummy = new ListNode(0);
	        dummy.next=head;
	        ListNode current = dummy;
	        while(current.next!=null || current.next.next!=null){
	            ListNode first = current.next;
	            ListNode second = current.next.next;
	            first.next=second.next;
	            current.next=second;
	            current.next.next=first;
	            current=current.next.next;
	        }
	        return dummy.next;
	    }
    
    public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		head.next=a;
		//a.next=b;
		//b.next=null;
		Solution s = new Solution();
		//System.out.println(s.swapPairs(head).next.next.val);
		ListNode d = new ListNode(2);
		d.next=a;
		ListNode f = new ListNode();
		f=d;
		d.val=3;
		System.out.println(f.val);
	}
}