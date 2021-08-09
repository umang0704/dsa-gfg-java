package topic.bst;

public class BSTCheck {
	static int prev = Integer.MIN_VALUE;

	public static boolean isBST2(Node root) {
		if (root == null)
			return true;

		if (isBST2(root.left) == false)
			return false;

		if (root.key <= prev)
			return false;

		prev = root.key;

		return isBST2(root.right);
	}

	public static boolean isBST1(Node root, int min, int max) {
		if (root == null)
			return true;

		return (root.key > min && 
				root.key < max && 
				isBST1(root.left, min, root.key) && 
				isBST1(root.right, root.key, max));
	}

	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(3);

		if (isBST2(root))
			System.out.println("IS BST");
		else
			System.out.println("Not a BST");
		if (isBST1(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
			System.out.println("IS BST");
		else
			System.out.println("Not a BST");
	}
}
