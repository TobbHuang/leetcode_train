/**
 * Created by huangtao on 2018/11/1.
 */
public class p25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = new ListNode(0);
        node.next = head;

        ListNode result = new ListNode(0);
        result.next = head;
        ListNode resultHead = result;

        ListNode[] arr = new ListNode[k];
        while (true) {
            boolean flag = false;
            for (int i = 0; i < k; i++) {
                if (node.next == null) {
                    flag = true;
                    break;
                }
                arr[i] = node.next;
                node = node.next;
            }
            if (flag) {
                break;
            }

            result.next = arr[k - 1];
            arr[0].next = arr[k - 1].next;
            for (int i = k - 1; i > 0; i--) {
                arr[i].next = arr[i - 1];
            }
            result = arr[0];
            node = arr[0];
        }
        return resultHead.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
