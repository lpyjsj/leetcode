//Given a singly linked list, determine if it is a palindrome.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;
        ListNode fast=head,slow=head;
        int count=1;
        while(fast.next!=null)
        {
           slow=slow.next;
           fast=fast.next;
           count++;
           if(fast.next!=null)
           {
             fast=fast.next;
            count++;
           }
        }
        
        ListNode firsthalf;
        ListNode secondhalf=count%2==0?slow:slow.next;
        firsthalf=reverseList(head,slow);
        
        for(;secondhalf!=null && firsthalf!=null;)
         {
             if(secondhalf.val!=firsthalf.val)
              return false;
             secondhalf=secondhalf.next;
             firsthalf=firsthalf.next;
         }

         return true;
    }
    
    public ListNode reverseList(ListNode head,ListNode middle)
    {
        ListNode pre=null,p=head,next;
        while(p!=middle)
        {
          next=p.next;
          p.next=pre;
          pre=p;
          p=next;
        }
       
       return pre;  
        
    }
}