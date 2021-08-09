package topic.trees;

public class BTree_to_DoublyLL {
    private static Node prev = null;

    public static Node fn(Node root) {
        if (root == null) return null;

        Node head = fn(root.left);

        if (prev == null) prev = head;
        else {
            prev.right = root;
            root.left = prev;
        }

        prev = root;

        fn(root.right);
        return head;

    }

    public static void main(String[] args) {

    }
}
