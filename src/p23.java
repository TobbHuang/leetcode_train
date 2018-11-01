import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by huangtao on 2018/11/1.
 */
public class p23 {

    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> nodes = new ArrayList<>();
        for(ListNode node : lists){
            if(node != null){
                nodes.add(node);
            }
        }

        Collections.sort(nodes,new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        ListNode result = new ListNode(0);
        ListNode head = result;
        while(nodes.size() > 0){
            result.next = nodes.get(0);
            result = result.next;

            ListNode first = nodes.remove(0).next;
            if(first != null){
                boolean flag = false;
                for(int i = 0;i < nodes.size();i++){
                    if(first.val <= nodes.get(i).val){
                        flag = true;
                        nodes.add(i, first);
                        break;
                    }
                }
                if(!flag){
                    nodes.add(first);
                }
            }
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
