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
/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false

*/

class Solution {
    
    public boolean isSymmetric(TreeNode root) {
//Check if the tree is symmetric by comparing the root with itself.
    return isSame(root, root);
    }

    private boolean isSame(TreeNode p, TreeNode q){
//If both nodes are null, they are symmetric (base case).
        if(p==null && q==null){
            return true;
        }
//If one node is null and the other is not, they are not symmetric.
        if(p==null || q==null){
            return false;
        }
//If the values of the two nodes are different, they are not symmetric.
        if(p.val!=q.val){
            return false;
        }
//Recursively check if the left subtree of node is a mirror of the right subtree and right of left
        boolean left =isSame(p.left, q.right);
        boolean right = isSame(p.right, q.left);
        
//Return true if both left and right subtrees are symmetric.
        return left && right;
    }
}

//bottom-up
//TC: O(N)
//SC: O(H), Height of tree, If it's balanced then O(logN)
