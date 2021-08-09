package topic.trees;

import java.util.*;

public class TreeTraversalInSprial {
    public static void fn2(Node root) {
        if (root == null) return;


        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node t = s1.pop();
                System.out.println(t.key);
                if (t.left != null) s2.push(t.left);
                if (t.right != null) s2.push(t.right);
            }
            while (!s2.isEmpty()){
                Node t = s2.pop();
                System.out.println(t.key);
                if (t.right != null) s1.push(t.right);
                if (t.left != null) s1.push(t.left);
            }
        }

    }

    public static void fn1(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        Stack<Node> b = new Stack<>();

        q.offer(root);

        //false-backward, true-forward
        boolean dir = false;

        while (!q.isEmpty()) {
            int s = q.size();

            for (int i = 0; i < s; i++) {
                Node t = q.poll();

                if (dir)
                    b.push(t);
                else
                    System.out.println(t.key);

                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);

            }

            if (dir)
                while (!b.isEmpty())
                    System.out.println(b.pop().key);

            dir = !dir;
        }

    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        //fn1(root);
        fn2(root);
    }
}
