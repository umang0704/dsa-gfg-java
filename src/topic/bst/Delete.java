package topic.bst;

public class Delete {
	 /**
	  * ALGORITHM - del(root, x)
	  * - Reach the required node to be deleted
	  * 	-if root == null : return null
	  * 
	  * 	-if root.key > x : root.left = del(root.left,x)
	  * 	-else if root.key < x : root.right = del(root.right,x)
	  * 	-else:(REACHED)
	  * 	
	  * -When reached, Check with of 3 cases is there
	  * 		-if root.left == null : return root.right
	  * 		-else if root.right == null : return root.left
	  * 		-else :
	  * 			-Get the successor in right subtree(greater earliest successor)
	  * 			-make the root.key = successor.key
	  * 			-delete the successor from the tree.
	  */
	public static Node del_rec(Node root,Integer k) {
		if(root == null) return null;
		
		if(root.key < k) root.right = del_rec(root.right, k);
		else if(root.key > k) root.left = del_rec(root.left, k);
		else {
			Node succesorNode = getSuccessorNode(root);
			root.key = succesorNode.key;
			root.right = del_rec(root.right,succesorNode.key);
		}
		return root;
		
	}
	
	/**
	 * ALGORITHM FOR SUCCCESSOR NODE - getSuccessor(Node root)
	 * - Create a Node s =  righ node of root
	 * - repeat while s and left of s in not null :
	 * 		- s = s.left
	 * - return s
	 */
	private static Node getSuccessorNode(Node root) {
		Node successorNode = root.right;
		while(successorNode != null && successorNode.left != null) 
			successorNode = successorNode.left;
		return successorNode;
	}
}
