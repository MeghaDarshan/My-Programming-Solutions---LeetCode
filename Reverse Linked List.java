/* Reverse a singly linked list.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
      if(head==null || head.next ==null)return head;
       return reverse(head, null);
        
        
        
    }
    public ListNode reverse(ListNode head, ListNode newHead){
        if(head==null)return newHead;
        ListNode Next = head.next;
        head.next = newHead;
        newHead = head;
        return reverse(Next, newHead);
    }
    
}