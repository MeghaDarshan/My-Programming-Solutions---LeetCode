/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart=0;
        int preEnd = preorder.length-1;
        int inStart=0;
        int inEnd = inorder.length-1;
        
        return construct(preorder, preStart, preEnd, inorder, inStart, inEnd);
    }
    public TreeNode construct(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        
        int res = preorder[preStart];int k=0;
        TreeNode output = new TreeNode(res);
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==res){
                k=i;
                break;
            }
        }
        
        output.left = construct(preorder, preStart+1, preStart+(k-inStart), inorder, inStart, k-1);
        output.right = construct(preorder, preStart+k-inStart+1, preEnd, inorder, k+1, inEnd);
        return output;
    }
}