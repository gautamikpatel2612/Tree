/*
Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.

Example 1:
  Input: root = [1,2,3,4,5]
  Output: 3
  Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:
  Input: root = [1,2]
  Output: 1
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
   
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {

        maxDepth(root);
        return diameter;
    }

    private int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        diameter = Math.max(diameter, left+right);
        return 1 + Math.max(left, right);
    }
}
//bottom-up
//TC: O(N)
//SC: O(H)

// Variable to store the maximum diameter
// Call the helper method to compute the depth of the tree
// The diameter of the tree is stored in the 'diameter' variable
//Helper method to calculate the maximum depth. It also updates the diameter while traversing the tree
// Base case: if the current node is null, return a depth of 0
// Recursively find the depth of the left subtree and right subtree
// Update the diameter: it's the maximum of the current diameter and the sum of the left and right subtree depths
// The depth of the current node is 1 plus the maximum depth of its left and right subtrees
