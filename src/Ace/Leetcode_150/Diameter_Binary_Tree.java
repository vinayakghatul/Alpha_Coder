package Ace.Leetcode_150;

import java.util.*;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 *
 * The length of a path between two nodes is represented by the number of edges between them.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;


    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



class Diameter_Binary_Tree {

    // global diameter tracker
    int diameter = 0;

    public int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        diameter = Math.max(diameter, left+right);

        return Math.max(left, right) + 1;
    }

    public static void main(String args[]) {

        /*
               1
              / \
             2   3
            / \
           4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3);

        Diameter_Binary_Tree solution = new Diameter_Binary_Tree();
        int result = solution.diameter(root);

        System.out.println("Diameter of Binary Tree: " + result); // Expected: 3
    }
 }
