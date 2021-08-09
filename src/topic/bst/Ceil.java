package topic.bst;

public class Ceil {
	/**
	 * ALGORITHM(root,x)
	 * 
	 * - create a node res = root
	 * - iterate until root != null :
	 * 		- if root.key == x : return root 
	 * 		- else if root.key < x : root = root.right
	 * 		- else :
	 * 			- res = root
	 * 			- root = root.left 
	 * -return res
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public static Node ceil(Node root, int data) {
		Node resNode = root;
		while (root != null) {
			if (root.key == data)
				return root;
			else if (root.key < data)
				root = root.right;
			else {
				resNode = root;
				root = root.left;
			}
		}
		return resNode;
	}

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.right = new Node(20);
		root.right.left = new Node(18);
		root.right.left.left = new Node(16);
		root.right.right = new Node(80);
		int x = 17;

		System.out.print("Ceil: " + (ceil(root, x).key));
	}
}
