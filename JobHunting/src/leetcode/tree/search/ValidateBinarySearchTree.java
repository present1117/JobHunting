package leetcode.tree.search;

import utils.TreeNode;

public class ValidateBinarySearchTree {
//	Given a binary tree, determine if it is a valid binary search tree (BST).
//
//	Assume a BST is defined as follows:
//
//	The left subtree of a node contains only nodes with keys less than the node's key.
//	The right subtree of a node contains only nodes with keys greater than the node's key.
//	Both the left and right subtrees must also be binary search trees.

//	have an solution with only constant space
	 public boolean isValidBST(TreeNode root) {
		 if (root == null)
			 return true;
		 return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	 }
	private boolean helper(TreeNode root, int min, int max) {
		if(root == null)
			return true;
		if(root.val <= min || root.val >= max)
			return false;
		return helper(root.left, min, root.val) && helper(root.right,root.val,max);
	}
}
