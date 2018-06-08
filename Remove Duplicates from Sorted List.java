/* Given a sorted linked list, delete all duplicates such that each element appear only once.*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next == null)return head;
       ListNode res = head;
       while(res!=null && res.next!=null){
           if(res.next.val == res.val){
               res.next = res.next.next;
           }
           else{
               res = res.next;
           }
       }
       return head; 
    }
}