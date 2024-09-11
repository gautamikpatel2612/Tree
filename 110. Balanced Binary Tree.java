/*
Given a binary tree, determine if it is 
height-balanced

Example 1:
  Input: root = [3,9,20,null,null,15,7]
  Output: true
  
Example 2:
  Input: root = [1,2,2,3,3,null,null,4,4]
  Output: false

Example 3:
  Input: root = []
  Output: true
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
    public boolean isBalanced(TreeNode root) {
       if(maxDepth(root) == -1){
            return false;
        }else{
            return true;
        }
    }

private int maxDepth(TreeNode root){
    if(root==null){
        return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

// If the right subtree is unbalanced
    if(right==-1){
        return -1;
    }
// If the left subtree is unbalanced
    if(left==-1){
        return -1;
    }

    if(Math.abs(left-right) > 1){
        return -1;//false
    }
    return 1 + Math.max(left, right);
}
}
//bottom-up
//TC: O(N)
//SC: O(H), Height of the tree

// Call the helper method to calculate the depth and check balance
// If maxDepth returns -1, the tree is unbalanced
// if (maxDepth(root) == -1) { return false;  Tree is not balanced

// Helper method to calculate the maximum depth of the tree
// Returns -1 if the tree is not balanced, otherwise returns the depth of the tree
// Base case: if the current node is null, the depth is 0
// Recursively find the depth of the left subtree
// Recursively find the depth of the right subtree
// If the left subtree is unbalanced,
// If the right subtree is unbalanced,
// Check if the current subtree is balanced
// The tree is unbalanced if the difference in depths is greater than 1
// Return the depth of the current subtree
