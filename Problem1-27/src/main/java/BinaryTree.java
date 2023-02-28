import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    LinkedList<Object> getRangeValues(Node root, int start, int end) {

        LinkedList<Object> response = new LinkedList<>();

        if (root == null) {
            return response;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);


        Node nodeInHand;

        int level = 0;

        while (!queue.isEmpty()) {

            level++;

            int size = queue.size();


            while (size != 0) {
                nodeInHand = queue.poll();

                if (level >= start && level <= end) {
                    response.add(nodeInHand.data);
                }
                if (nodeInHand.left != null || nodeInHand.right != null) {
                    queue.add(nodeInHand.left);
                }

                if (nodeInHand.right != null) {
                    queue.add(nodeInHand.right);
                }

                size--;
            }
        }
        return response;
    }
}
