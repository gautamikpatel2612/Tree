 /* 
Given the root of a binary tree, invert the tree, and return its root.
Example 1:
  Input: root = [4,2,7,1,3,6,9]
  Output: [4,7,2,9,6,3,1]
Example 2:
  Input: root = [2,1,3]
  Output: [2,3,1]
Example 3:
  Input: root = []
  Output: []
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
    public TreeNode invertTree(TreeNode root) {
// Base case: if the tree is empty, return null.
        if(root==null){
            return root;
        }
// Recursively invert the left subtree and invert the right subtree.
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

// Swap the left and right children of the current node.
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

// Return the root node, which now has its left and right children inverted.
        return root;
    }
}
//bottom-up
//TC: O(N)
//SC: O(H), Height of tree
