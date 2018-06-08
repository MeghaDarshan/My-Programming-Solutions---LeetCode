/* Given an array where elements are sorted in ascending order, convert it to a height balanced BST.*/

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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
       return createBinary(nums, 0, nums.length-1);
    }
   public TreeNode createBinary(int[] nums, int start, int last){
       if(start>last)return null;
       int mid = (start+last)/2;
       
       TreeNode root = new TreeNode(nums[mid]);
       
       root.left = createBinary(nums,start,mid-1);
       root.right = createBinary(nums,mid+1,last);
       
       return root;
   }
}