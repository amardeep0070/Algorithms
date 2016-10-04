package linkedlistpair;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddwithCarry {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        dummy.next=l1;
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode tempnode= new ListNode(0);
        int temp=0;
        while(c1.next!=null || c2.next!=null){
        	int value=c1.val+c2.val+temp;
        	if(c1.next==null){
        		if(value>9){
        			c1.val=value%10;
                       ListNode new1 = new ListNode(value/10);
                       tempnode=c1.next.next;
                       c1.next=new1;
                         new1.next=tempnode;
                         c1=new1;
        		}
        		 c1.next=c2.next;
        		 return l1;
        	}
            // if(value>9){
            //   c1.val=value%10;
            //   ListNode new1 = new ListNode(value/10);
            //   tempnode=c1.next.next;
            //   c1.next=new1;
            //     new1.next=tempnode;
            //     c1=new1;
            // }else {
            c1.val=value%10;
            temp=value/10;
            
            
            //System.out.println(temp);
            c1=c1.next;
            c2=c2.next;
        }
        
        //int tem=c1.val+c2.val+temp;
        // if(tem>9){
        //     c1.val=tem%10;
        //     ListNode new1 = new ListNode(tem/10);
        //     c1.next=new1;
        // }
        // else c1.val=tem;
        if(c1==null && c2!=null){
            c1=c2.next;
        }
        // while(c1.next!=null && c2.next==null){
        //     c1.next=c2.next;
        // }
        return l1;
    }
}
