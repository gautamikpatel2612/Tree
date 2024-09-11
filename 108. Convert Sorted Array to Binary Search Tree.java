/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced binary search tree.

Example 1:
  Input: nums = [-10,-3,0,5,9]
  Output: [0,-3,9,-10,null,5]
  Explanation: [0,-10,5,null,-3,null,9] is also accepted:
  
Example 2:
  Input: nums = [1,3]
  Output: [3,1]
  Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length-1);
    }

    private TreeNode createTree(int[] nums, int left, int right){
// Base case: range is invalid, return null
        if (left > right) {// Check if the range is valid
            return null;
        }
        int mid = left + (right - left) / 2;// Calculate the middle index

// Create a new TreeNode with the middle element as root
        TreeNode root = new TreeNode(nums[mid]);

// Recursively create the left and right subtrees
        root.left = createTree(nums, left, mid-1);
        root.right = createTree(nums, mid+1, right);
        
        return root;// Return the root of the subtree
    }
}
//TC: O(N)
//SC: O(H)
