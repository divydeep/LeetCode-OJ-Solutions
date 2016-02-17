/**
 * Created by Divydeep Agarwal on 2/10/2016.
 */
//Given a linked list, remove the nth node from the end of list and return its head.
//        Given linked list: 1->2->3->4->5, and n = 2.
//        After removing the second node from the end, the linked list becomes 1->2->3->5.
//        Note:
//        Given n will always be valid.
//        Try to do this in one pass.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;

        ListNode runner = head;
        ListNode anchor = head;
        for(int i=n; i>0;i--){
            if(runner != null){
                runner = runner.next;
            }
        }

        if(runner == null) return head.next;

        while(runner.next != null){
            runner = runner.next;
            anchor = anchor.next;
        }
        anchor.next = anchor.next.next;
        return head;
    }
}
