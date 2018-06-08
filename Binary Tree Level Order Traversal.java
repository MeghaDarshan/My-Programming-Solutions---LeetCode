/* Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).*/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
      
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null)return list;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);
        int curl=0;
        while(!que.isEmpty()){
         List<Integer> l = new ArrayList<Integer>();
            curl = que.size();
            for(int i=0;i<curl;i++){
            TreeNode peek = que.poll();
                l.add(peek.val);
            if(peek.left!=null){
                que.offer(peek.left);        
            }
                if(peek.right!=null){que.offer(peek.right);}
            }
            list.add(l);
        }
          return list;    
    }
}