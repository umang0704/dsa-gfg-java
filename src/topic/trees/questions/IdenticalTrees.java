package topic.trees.questions;

import topic.trees.Node;

public class IdenticalTrees {
    boolean isIdentical(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a != null && b != null) return ((a.key == b.key)
                && isIdentical(a.left, b.left)
                && isIdentical(a.right, b.right));
        return false;
    }
}
