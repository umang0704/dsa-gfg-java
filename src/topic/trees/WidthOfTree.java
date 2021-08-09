package topic.trees;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfTree {
    public static int w(Node root) {
        if (root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int w = 0;

        while (!q.isEmpty()) {
            int s = q.size();
            w = Math.max(w,s);
            for (int i = 0; i < s; i++) {
                Node t = q.poll();
                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }
        }
        return w;
    }

}
