package cc150.Question04;

import utils.TreeNode;

public class TreesandGraphs4_03 {
//Given a sorted (increasing order) array with unique integer elements, write an algorithm
//to create a binary search tree with minimal height.
	TreeNode createMinimalBST(int [] arr, int start, int end){
		if(end < start)
			return null;
		
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = createMinimalBST(arr, start, mid-1);
		node.right = createMinimalBST(arr, mid+1, end);
		return node;
	}
	
	TreeNode createMinimalBST(int [] arr){
		return createMinimalBST(arr, 0, arr.length-1);
	}
}
