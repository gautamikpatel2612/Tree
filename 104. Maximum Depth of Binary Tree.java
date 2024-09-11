/*
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:
  Input: root = [3,9,20,null,null,15,7]
  Output: 3
Example 2:
  Input: root = [1,null,2]
  Output: 2
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
// Base case: if the current node is null, return a depth of 0
        if(root==null){
            return 0;
        }

// Recursively find the depth of the left subtree and right subtree
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

// The depth of the current node is 1 plus the maximum depth of its left and right subtrees
        return 1 + Math.max(left, right);
    }
}
//bottom-up
//TC: O(N)
//SC: O(H), Height of the tree
