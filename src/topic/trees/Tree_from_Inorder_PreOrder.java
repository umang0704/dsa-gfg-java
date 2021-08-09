package topic.trees;

import topic.utilities.Operations;

public class Tree_from_Inorder_PreOrder {
    private static int preOrderPointer = 0;

    public static Node fn(Integer[] in, Integer[] pre, int s_in, int s_pre) {
        if (s_in != s_pre) return null;

        Node root = new Node(pre[preOrderPointer++]);

        int inOrderPointer = Operations.indexOf(in,root.key);

        root.left = fn(in,pre,s_in,inOrderPointer-1);
        root.right = fn(in,pre,inOrderPointer+1,s_pre);

        return root;
    }

    public static void main(String[] args) {

    }
}
