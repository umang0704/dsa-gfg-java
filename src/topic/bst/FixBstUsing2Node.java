package topic.bst;

public class FixBstUsing2Node {
	private static Node prev, f, s;

	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	public static void fix_bst(Node root) {
		if (root == null)
			return;
		fix_bst(root.left);
		if (prev != null && root.key < prev.key) {
			if (f == null)
				f = prev;
			s = root;
		}
		prev = root;
		fix_bst(root.right);
	}

	public static void main(String[] args) {
		Node root = new Node(18);
		root.left = new Node(60);
		root.right = new Node(70);
		root.left.left = new Node(4);
		root.right.left = new Node(8);
		root.right.right = new Node(80);
		inorder(root); 
		System.out.println();
		fix_bst(root);
		Integer tNode = f.key;
		f.key = s.key;
		s.key = tNode;
		inorder(root);
	}
}
