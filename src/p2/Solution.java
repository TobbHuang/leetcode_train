package p2;

/**
 * Created by huangtao on 2018/8/29.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int overflow = sum / 10;
        ListNode resultNode = new ListNode(sum - 10 * overflow);
        ListNode node = resultNode;

        while (true) {
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null || l2 == null) {
                break;
            }

            sum = l1.val + l2.val + overflow;
            overflow = sum / 10;

            node.next = new ListNode(sum - 10 * overflow);
            node = node.next;
        }

        if (l1 == null && l2 == null) {
            if(overflow > 0){
                node.next = new ListNode(overflow);
            }
            return resultNode;
        }

        if (l1 == null) {
            l1 = l2;
        }

        while (l1 != null) {
            sum = l1.val + overflow;
            overflow = sum / 10;
            node.next = new ListNode(sum - 10 * overflow);
            node = node.next;

            l1 = l1.next;
        }
        if(overflow > 0){
            node.next = new ListNode(overflow);
        }

        return resultNode;
    }

}
