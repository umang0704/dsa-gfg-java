package topic.bst;

public class Insert {
	public static Node insert(Node root, int data) {
		if (root == null)
			return new Node(data);
		if (root.key < data)
			root.right = insert(root.right, data);
		else if(root.key>data)
			root.left = insert(root.left, data);
		return root;
	}

	/**
	 * ALGORITHM
	 * create variable
	 * 		parent = null
	 * 		curr = root
	 * 		temp = new Node(data);
	 * Iterate until curr is not null :
	 * 		set parent to curr
	 * 		if curr.key > data : set curr to curr.left
	 * 		else if curr.ket < data : curr = curr.right
	 * 		else return root and end
	 * if parent is null return temp
	 * if parent.key < data : parent.right = temp
	 * else : parent.left = temp
	 * 
	 * return root
	 */
	public static Node insert_itr(Node root, int data) {
		Node currNode = root;
		Node parentNode = null;
		Node tempNode = new Node(data);
		
		while (currNode!=null) {
			parentNode = currNode;
			if(currNode.key<data)
				currNode = currNode.right;
			else if(currNode.key > data)
				currNode = currNode.left;
			else 
				return root;
		}
		
		if(parentNode == null)
			return tempNode;
		if(parentNode.key<data)
			parentNode.right = tempNode;
		else 
			parentNode.left = tempNode;
		return root;
	}
	public static void main(String[] args) {

	}
}
