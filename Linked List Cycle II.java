/* Given a linked list, return the node where the cycle begins. If there is no cycle, return null.*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)return null;
        HashSet<ListNode> set = new HashSet<ListNode>();
        
        while(head!=null && head.next!=null){
            if(set.contains(head)){return head;}
            set.add(head);
            head = head.next;
        }
        return null;
    }
}