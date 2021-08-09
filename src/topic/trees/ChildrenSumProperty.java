package topic.trees;

public class ChildrenSumProperty {
    public static boolean sol(Node root){
        if(root == null) return true;
        if (root.left==null&&root.right==null) return true;

        int sum = 0;
        if(root.left!=null) sum+=root.left.key;
        if(root.right!=null) sum+=root.right.key;

        return root.key==sum && sol(root.left) && sol(root.right);
    }
    public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(10);
		System.out.println(sol(node));
	}
}
