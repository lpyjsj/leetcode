/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
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
    public ListNode removeElements(ListNode head, int val) {
     if(head==null) 
            return null;    
     if(head.next==null && head.val==val)
           return null;
      else if(head.next==null && head.val!=val)
           return head;

     for(ListNode p=head;p!=null;)
     {  
        if(p.val!=val) p=p.next; 
        else if(p.next!=null)
        { p.val=p.next.val;
          p.next=p.next.next;
        }
        else
        {
          if(p==head) return null;
          else
          for(ListNode p1=head;p1!=null;p1=p1.next)
            if(p1.next==p) 
             {
                 p1.next=null;
                 return head ;
                 
             }
        }
             
     }
     return head;
    }
}