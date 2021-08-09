package topic.trees;

import java.util.ArrayList;

public class Least_Common_Ancestor {
    public static boolean find_path(Node root, ArrayList<Node> p, int n) {
        if(root==null) return false;
        p.add(root);
        if(root.key==n) return true;
        if(find_path(root.left,p,n) || find_path(root.right,p,n))
            return true;
        p.remove(p.size()-1);
        return false;
    }

    public static Node lca1(Node root, int n1, int n2) {
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();
        if (find_path(root, p1, n1) == false || find_path(root, p2, n2) == false)
            return null;
        for (int i = 0; i < p1.size() - 1 && i < p2.size() - 1; i++)
            if(p1.get(i+1)!=p2.get(i+1))
                return p1.get(i);
        return null;
    }

    public static Node lca2(Node root,int n1,int n2){
        if(root == null) return null;
        if(root.key==n1 || root.key==n2) return root;

        Node lca_left_subtree = lca2(root.left,n1,n2);
        Node lca_right_subtree = lca2(root.right,n1,n2);

        if(lca_left_subtree!=null && lca_right_subtree!=null)
            return root;
        if(lca_left_subtree!=null)
            return lca_left_subtree;
        else
            return lca_right_subtree;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        int n1=20,n2=50;

        Node ans=lca1(root,n1,n2);
        System.out.println("LCA: "+ans.key);
    }
}
