//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
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
        ListNode first=head;
        ListNode second=head;
        ListNode cycleNode=head;
        if(head==null || head.next==null)
        return null;
        do
        {
         if(first.next!=null)    
             first=first.next.next;
         else
             first=first.next;  
         second=second.next;
        }while(first!=second && first!=null);
        
       if(first==null)
         return null;
       else 
       { //这里是关键
         while(cycleNode!=first)
          {
             cycleNode=cycleNode.next;
             first=first.next;
          }
         return cycleNode;
       }     
        
    }
}
