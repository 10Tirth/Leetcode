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
    static class info{
        int ht;
        int diameter;
        public info(int ht,int diameter){
            this.ht=ht;
            this.diameter=diameter;
        }
    }
    public static info diameter(TreeNode root){
        if(root==null) return new info(0,0);

        info linfo=diameter(root.left);
        info rinfo=diameter(root.right);
        int diameter=Math.max(linfo.diameter,Math.max(rinfo.diameter,linfo.ht+rinfo.ht+1));
        int height=Math.max(linfo.ht,rinfo.ht)+1;

        return new info(height,diameter);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        info ans=diameter(root);
        return ans.diameter-1;
    }
}