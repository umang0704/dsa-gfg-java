package topic.bst;

public class Search {
	public static boolean search_rec(Node root, int key) {
		if (root == null)
			return false;

		if (root.key == key)
			return true;
		else if (root.key < key)
			return search_rec(root.right, key);
		else
			return search_rec(root.left, key);
	}

	public static boolean search_itr(Node root, int key) {
		while (root != null) {
			if (root.key == key)
				return true;
			else if (root.key < key)
				root = root.right;
			else
				root = root.left;
		}
		return false;
	}

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.right = new Node(20);
		root.right.left = new Node(18);
		root.right.left.left = new Node(16);
		root.right.right = new Node(80);
		int x = 16;
		System.out.println(search_rec(root, x));
		System.out.println(search_itr(root, x));
	}
}
