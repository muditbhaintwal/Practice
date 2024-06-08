package org.mudit.dsa.dsa.binaryTree;


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

        // 1- Build a tree Preorder
        // 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1    (-1 are NULL represents leaf nodes)

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        Node addedNode = binaryTree.addNode(1, null, null);
        binaryTree.addNode(2, addedNode, null);
    }

    private Node addNode(int i, Node l, Node r) {
        Node node = new Node(i, l, r);
        return node;
    }

}
