package dsa;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (current.value < value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            } else {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (current.value < value)
                current = current.rightChild;
            else if (current.value > value) {
                current = current.leftChild;
            } else
                return true;
        }
        return false;
    }

    public void preOrderTraverse() {
        preOrderTraverse(root);
    }

    public void postOrderTraverse() {
        postOrderTraverse(root);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public int min() {
        return min(root);
    }

    private void preOrderTraverse(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        preOrderTraverse(root.leftChild);
        preOrderTraverse(root.rightChild);
    }

    private void postOrderTraverse(Node root) {
        if (root == null)
            return;
        preOrderTraverse(root.leftChild);
        preOrderTraverse(root.rightChild);
        System.out.println(root.value);
    }

    private void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.value);
        inOrderTraversal(root.rightChild);
    }

    public int min(Node root) {
        if (isNull(root))
            return root.value;
        var left = min(root.leftChild);
        var right = min(root.rightChild);
        return Math.min(Math.min(left, right), root.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;
        if (isNull(root))
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;
        if (first != null && second != null)
            return (first.value == second.value && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild));
        return false;

    }

    private boolean isNull(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }
}
