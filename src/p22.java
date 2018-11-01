import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangtao on 2018/10/30.
 */
public class p22 {

    public List<String> generateParenthesis(int n) {
        List<Node> nodes = new ArrayList<>();
        Node node = new Node();
        node.str = "(";
        node.flag = 1;
        nodes.add(node);

        List<Node> results = new ArrayList<>();
        results.addAll(push(nodes, n));
        results.addAll(pull(nodes, n));

        List<String> strs = new ArrayList<>();
        for(Node node1 : results){
            strs.add(node1.str);
        }
        return strs;
    }

    private List<Node> push(List<Node> nodes, int n){
        if(n == 0){
            return nodes;
        }
        List<Node> pushNodes = new ArrayList<>();
        for(Node node : nodes){
            if(node.flag < n){
                Node pushNode = new Node();
                pushNode.str = node.str + "(";
                pushNode.flag = node.flag + 1;
                pushNodes.add(pushNode);
            }
        }

        List<Node> results = new ArrayList<>();
        if(pushNodes.size() > 0){
            List<Node> push = push(pushNodes, n);
            List<Node> pull = pull(pushNodes, n);

            results.addAll(push);
            results.addAll(pull);
        }
        return results;
    }

    private List<Node> pull(List<Node> nodes, int n){
        if(n == 0){
            return nodes;
        }
        List<Node> pullNodes = new ArrayList<>();
        for(Node node : nodes){
            if(node.flag > 0 && node.flag <= n){
                Node pullNode = new Node();
                pullNode.str = node.str + ")";
                pullNode.flag = node.flag - 1;
                pullNodes.add(pullNode);
            }
        }

        List<Node> results = new ArrayList<>();
        if(n > 1 && pullNodes.size() > 0){
            List<Node> push = push(pullNodes, n - 1);
            List<Node> pull = pull(pullNodes, n - 1);

            results.addAll(push);
            results.addAll(pull);
        } else {
            return pullNodes;
        }
        return results;
    }

    class Node {
        String str;
        int flag;
    }

}

