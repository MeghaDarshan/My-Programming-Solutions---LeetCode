/*Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.*/

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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count=0;
      
        while(curr!=null || !stack.isEmpty()){
            if(curr!=null){  
                stack.push(curr);
                curr = curr.left;
            }
            else{curr = stack.pop();
            ++count;
            if(count==k){
                return curr.val;
            }
            curr = curr.right;}
            
        }
       return -1; 
    }
}