/*Given a linked list, remove the n-th node from the end of list and return its head.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode slow = head;
        ListNode fast =head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null){
            fast =fast.next;
            if(fast!=null){
            slow=slow.next;
            }
            
        }
       
        slow.next = slow.next.next;
        return head;
    }
     
}