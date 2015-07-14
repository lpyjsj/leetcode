/*
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fakehead=new ListNode(0);
        fakehead.next=head;
        ListNode pre=fakehead;
        ListNode fast=head,slow=head;
        int count;
        while(fast!=null)
        {
            count=0;
            while(fast!=null && fast.val==slow.val)
              {fast=fast.next;count++ ;}
             
             if(count>1)
               pre.next=fast;
             else 
               pre=pre.next;
             slow=fast;
        }
       return fakehead.next; 
    }
}
