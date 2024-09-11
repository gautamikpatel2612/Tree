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

    public boolean isSameTree(TreeNode p, TreeNode q) {
         // If both nodes are null, they are the same
        if(p==null && q==null){
            return true;
        }
        // If one node is null and the other is not, they are not the same
        if(p==null || q==null){
            return false;
        }
        //IF the values ar enot same 
        if(p.val!=q.val){
            return false;
        }
        // Recursively check if the left subtrees and right subtrees are the same
        boolean left =  isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        // If both subtrees are the same 
        return left && right;
    }
}
//bottom-up
//TC: O(N)
//SC: O(N)
