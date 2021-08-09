package topic.bst;


public class Kth_Smallest_Element {
	private static class node1 {
		int key;
		node1 leftBstNode;
		node1 rightBstNode;
		int lcount;

		public node1(int key) {
			this.key = key;
		}
	}

	public static node1 insert(node1 root, int key) {
		if (root == null) {
			return new node1(key);
		}
		if (key < root.key) {
			root.leftBstNode = insert(root.leftBstNode, key);
			root.lcount++;
		} else if (key > root.key) {
			root.rightBstNode = insert(root.rightBstNode, key);
		}
		return root;
	}

	public static node1 kthSmallesNode(node1 root, int k) {
		if (root == null)
			return null;
		int c = root.lcount + 1;

		if (c == k)
			return root;
		if (c > k)
			return kthSmallesNode(root.leftBstNode, k);
		return kthSmallesNode(root.rightBstNode, k - c);

	}

	public static void main(String[] args) {
		node1 root = null;
		int keys[] = { 20, 8, 22, 4, 12, 10, 14 };

		for (int x : keys)
			root = insert(root, x);

		int k = 4;
		node1 res = kthSmallesNode(root, k);
		if (res == null)
			System.out.println("There are less " + "than k nodes in the BST");
		else
			System.out.println("K-th Smallest" + " Element is " + res.key);
	}
}
