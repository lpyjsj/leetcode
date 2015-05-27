/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null || m==n)
         return head;
        ListNode p,pm;
        ListNode fakehead=new ListNode(-1);
        fakehead.next=head;
        int i;
        for(p=head,i=0;i<=m-1;p=p.next,i++);
        ListNode reversehead=null,preNodeM=p,next;
        p=p.next;
        pm=p;
        i=m;
        while(i<n+1)
        {
          next=p.next;    
          p.next=reversehead;
          reversehead=p;
          p=next;
          i++;
        }
      preNodeM.next=reversehead;
      pm=p;
      return fakehead.next;
    }
    
}