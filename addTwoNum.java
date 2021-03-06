import java.util.List;

/**
 * Created by Divydeep Agarwal on 12/25/2015.
 */
public class addTwoNum {
    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);
        ListNode p = output;
        int carry = 0;
        while(l1 != null || l2 != null || carry !=0){
            int sum = carry;
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum%10);
            p = p.next;
            carry = sum/10;

        }
        return output.next;
    }
}
