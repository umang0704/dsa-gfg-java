package topic.bst;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void inorder(Node root) {
        if (root != null) {
            postorder(root.left);
            System.out.println(root.key+"-");
            postorder(root.right);
        } 
    }

    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key);
        }
    }

    public static void preorder(Node root) {
        if (root != null) {

            System.out.print(root.key);
            inorder(root.left);
            inorder(root.right);
        }
    }

    public static void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node t = q.poll();
            System.out.println(t.key);
            if(t.left!=null) q.offer(t.left);
            if(t.right!=null) q.offer(t.right);
        }
    } 

}
