/*
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

Example 1:
  Input: root = [3,4,5,1,2], subRoot = [4,1,2]
  Output: true

Example 2:
  Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
  Output: false
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null || subRoot==null){
            return false;
        }
        if(isSame(root, subRoot) == true){
            return true;
        }
    
        boolean leftisSubtree = isSubtree(root.left, subRoot);
        boolean rightisSubtree = isSubtree(root.right, subRoot);

        return leftisSubtree || rightisSubtree;
    }
    private boolean isSame(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        boolean left = isSame(p.left, q.left);
        boolean right = isSame(p.right, q.right);

        return left && right;
    }
}

//TC: O(N)
//SC: O(H), Height of the tree

// If either root or subRoot is null, subRoot cannot be a subtree of root
//if cur tree's root and subRoot is match then return true
// Recursively check if subRoot is a subtree of the left or right subtree of root
// This means we need to explore all possible positions in the root tree

// Helper method to check if two trees are identical
// Both nodes are null, then true
// One of the nodes is null, or the values of the nodes are different, then false
// Recursively check if the left subtrees and right subtrees of both trees are valid
// Return true if both left and right subtrees are valid
       
