/**
 * Created by huangtao on 2018/11/1.
 */
public class p24 {

    public ListNode swapPairs(ListNode head) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode node = start;
        ListNode one, two;

        while (node.next != null && node.next.next != null) {
            one = node.next;
            two = one.next;
            one.next = two.next;
            two.next = one;
            node.next = two;
            node = one;
        }

        return start.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
