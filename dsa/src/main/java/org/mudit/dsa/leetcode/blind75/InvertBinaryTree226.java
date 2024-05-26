package org.mudit.dsa.leetcode.blind75;

/*
https://leetcode.com/problems/invert-binary-tree/description/

Given the root of a binary tree, invert the tree, and return its root.

 */
public class InvertBinaryTree226 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        // Base case: if the tree is empty...
        if (root == null) {
            return root;
        }

        // Swap left and right
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;


        invertTree(root.left);
        invertTree(root.right);

        return root;

    }


}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


