package leetcode.tree.traverse;

import utils.TreeNode;

public class BalancedBinaryTree {
//	Given a binary tree, determine if it is height-balanced.
//
//	For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(getDepth(root) == -1)
            return false;
        return true;
    }
    
    private int getDepth(TreeNode root){
        if(root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if(left == -1 || right == -1)
            return -1;
        if(Math.abs(left - right) > 1){
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
