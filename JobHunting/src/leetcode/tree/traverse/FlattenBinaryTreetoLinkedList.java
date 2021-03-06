package leetcode.tree.traverse;

import java.util.Stack;
import utils.TreeNode;

public class FlattenBinaryTreetoLinkedList {
	// ==================================================================  //    
//	Flatten Binary Tree to Linked List 
//Given a binary tree, flatten it to a linked list in-place.
//
//For example,
//Given
//
//         1
//        / \
//       2   5
//      / \   \
//     3   4   6
//The flattened tree should look like:
//   1
//    \
//     2
//      \
//       3
//        \
//         4
//          \
//           5
//            \
//             6
//click to show hints.
//
//Hints:
//If you notice carefully in the flattened tree, 
//each node's right child points to the next node of a pre-order traversal.
//==================================================================  //    
	public void flatten(TreeNode root) {
		if (root == null)
			return;
		TreeNode p = root;
		Stack<TreeNode> stack = new Stack<TreeNode>();

		while (p != null || !stack.empty()) {
			if (p.right != null) {
				stack.push(p.right);
			}

			if (p.left != null) {
				p.right = p.left;
				p.left = null;
			} else if (!stack.empty()) {
				TreeNode temp = stack.pop();
				p.right = temp;
			}
			p = p.right;
		}
	}
}
