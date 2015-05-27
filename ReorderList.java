/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
           return ;
        ListNode p1=head,p2=head;
        while(p2!=null && p2.next!=null)
          {
             p1=p1.next;
             p2=p2.next.next;
          }
        ListNode p3=reverseSubList(p1.next); 
        p1.next=null;
        p1=head;
        while(p3!=null)
        { 
         // ListNode node=new ListNode(p3.val);    
          ListNode p1next=p1.next;
          ListNode p3next=p3.next;
          p1.next=p3;
          p3.next=p1next;
          p1=p1next;
          p3=p3next;
        }
        return ;
    }
    public ListNode reverseSubList(ListNode p)
    {
      ListNode fakehead=null,next=null; 
      while(p!=null)
      {
          next=p.next;
          p.next=fakehead;
          fakehead=p;
          p=next;
        
      }
      return fakehead;
      
    }
}