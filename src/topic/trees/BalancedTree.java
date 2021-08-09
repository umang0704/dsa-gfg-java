package topic.trees;

public class BalancedTree {
    public static boolean solNaive(Node root) {
        if (root == null) return true;

        int hl = OperationsBinaryTree.height(root);
        int hr = OperationsBinaryTree.height(root);
        return (Math.abs(hl - hr) <= 1 &&
                solNaive(root.left) &&
                solNaive(root.right));
    }

    public static int solEfficient(Node root) {
        if (root == null) return 0;
        int hl = solEfficient(root.left);
        if (hl == -1) return -1;
        int hr = solEfficient(root.right);
        if (hr == -1) return -1;
        return Math.abs(hl - hr) > 1 ? -1 : Math.max(hl, hr) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);

        System.out.println(solNaive(root));
        System.out.println(solEfficient(root));

    }
}
