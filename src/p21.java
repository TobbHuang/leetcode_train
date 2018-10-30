/**
 * Created by huangtao on 2018/10/29.
 */
public class p21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode point = new ListNode(0);
        ListNode head = point;

        while(l1 != null && l2 != null){
            ListNode node = null;
            if(l1.val < l2.val){
                node = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                node = new ListNode(l2.val);
                l2 = l2.next;
            }
            point.next = node;
            point = node;
        }
        if(l1 == null){
            point.next = l2;
        } else {
            point.next = l1;
        }
        return head.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
