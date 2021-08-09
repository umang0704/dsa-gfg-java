package topic.trees;

import topic.utilities.Operations;

public class DiameterOfBTree {

    public static int fn(Node root){
        if(root==null) return 0;
        int d1 = 1+OperationsBinaryTree.height(root.left)+OperationsBinaryTree.height(root.right);
        int d2 = fn(root.right);
        int d3 =fn(root.right);

        return Math.max(d1,Math.max(d2,d3));
    }
    static int res = 0;
    static int fn2(Node root){
        if(root== null) return 0;

        int lh = fn2(root.left);
        int rh = fn2(root.right);

        res = Math.max(res,1+lh+rh);
        return 1+Math.max(lh,rh);
    }
}
