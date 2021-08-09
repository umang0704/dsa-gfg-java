package topic.bst;

public class Floor {
	/**
	 *ALGORITHM floor(root,data)
	 * - create a res node.
	 * - perform until root is not null
	 * 		- if root.key = data : return root
	 * 		- els if root.key > data : root = root.left
	 * 		- else :
	 * 			- res = root
	 * 			- root = root.right 
	 * - return root
	 */
	public static Node floor(Node root, int data) {
		Node resNode = null;
		while (root != null) {
			if (root.key == data) {
				return root;
			} else if (root.key > data) {
				root = root.left;
			} else {
				resNode = root;
				root = root.right;
			}
		}
		return resNode;
	}

	public static void main(String[] args) {
		Node root=new Node(15);
    	root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
    	int x=17;
    	System.out.println(floor(root, x).key);
	}
}
