package Ace.Leetcode_150;

import java.util.*;

public class Left_View_BT {

    // Using level order traversal
    public List<Integer> leftView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i=0;i<n;i++) {
                TreeNode temp = q.poll();
                if (i == 0) {
                    res.add(temp.val);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }

        return res;
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
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        Left_View_BT leftViewBt = new Left_View_BT();

        List<Integer> res = leftViewBt.leftView(root);

        res.forEach(System.out::println);
    }
}
