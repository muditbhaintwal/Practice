package binaryTree;


/**
 * it has max 2 nodes.
 * <p>
 * Traversal order (pre,In and post represent place of root)
 * Preorder - Root Left Right
 * Inorder - Left Root Right
 * PostOrder -  Left Right Root
 *
 * <p>
 * --
 * Operation,
 * print
 * traverse
 * add
 * delete
 * <p>
 */
public class BinaryTree {

    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello from Binary tree");

        BinaryTree binaryTree = new BinaryTree();
        Node addedNode = binaryTree.addNode(1, null, null);
        binaryTree.addNode(2, addedNode, null);
    }

    private Node addNode(int i, Node l, Node r) {
        Node node = new Node(i, l, r);
        return node;
    }

}
