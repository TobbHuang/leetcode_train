/**
 * Created by huangtao on 2018/10/29.
 */
public class p19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(head.val);
        node.next = head.next;

        ListNode left = new ListNode(head.val);
        left.next = head.next;

        int i;
        for (i = 0; node != null; node = node.next, i++) {
            if (i - n > 0) {
                left = left.next;
            }
        }
        if (i == n) {
            return head.next;
        } else if (i - n == 1) {
            head.next = head.next.next;
        } else {
            left.next = left.next.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

}
