package leetcode.tree.recursion;

import utils.TreeNode;

public class BinaryTreeMaximumPathSum {
// ==================================================================  //  
//  Binary Tree Maximum Path Sum
//  Given a binary tree, find the maximum path sum.
//
//  The path may start and end at any node in the tree.
//
//  For example:
//  Given the below binary tree,
//
//         1
//        / \
//       2   3
//  Return 6.
//==================================================================  //
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null)
        	return 0;
        if(root.left == null && root.right == null)
        	return root.val;
        helper(root);
        return max;
    }
    
    public int helper(TreeNode node){
    	if(node == null)
    		return 0;
    	// recursively get sum of left and right path
    	int left = Math.max(helper(node.left), 0);
    	int right = Math.max(helper(node.right), 0);
    	int nval = node.val;
    	//update maximum here
    	max = Math.max(nval+left+right, max);
    	// return sum of largest path of current node
    	return node.val + Math.max(left, right);
    }
}
