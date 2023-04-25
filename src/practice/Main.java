package practice;

// Given the root of a binary tree, return its maximum depth.
// A binary tree's maximum depth is the number of nodes along the longest path from the root node
// down to the farthest leaf node.

// Example 1:
// Input: root = [3,9,20,null,null,15,7]
// Output: 3
// Example 2:
// Input: root = [1,null,2]
// Output: 2

// Constraints:
// The number of nodes in the tree is in the range [0, 104].
// -100 <= Node.val <= 100

import com.sun.source.tree.Tree;

public class Main {

    public static void main(String[] args) {
//        TreeNode right = new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null));
//        TreeNode left = new TreeNode(9, null, null);
//        TreeNode root = new TreeNode(3, left, right);
        Integer[] array = {3,9,20,null,null,15,7};
        TreeNode root = new TreeNode().arrayToTreeNode(array);
        System.out.println(new Solution().maxDepth(root));
    }
}
