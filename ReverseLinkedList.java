/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
    if(head==null)
      return null;
    if(head.next==null)
     return head;
    ListNode pre=null;
    ListNode p=head;
    ListNode after=p.next;
    while(p!=null)
    {
      p.next=pre;
      pre=p;
      p=after;
      if(p!=null)
       after=p.next;
    }
    return pre;
    }
}