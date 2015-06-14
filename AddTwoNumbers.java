/*You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//链表模拟加法
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        int carry=0,sum=0;
        ListNode pre=null,head=l1;
        while(l1!=null && l2!=null)
        {
           sum=l1.val+l2.val+carry;
           l1.val=sum%10;
           carry=sum/10;
           pre=l1;
           l1=l1.next;
           l2=l2.next;
        }
        while(l1!=null)
         {
           sum=l1.val+carry;
           l1.val=sum%10;
           carry=sum/10;
           pre=l1;
           l1=l1.next;
         }
         
         if(l2!=null) pre.next=l2;
         while(l2!=null)
         {
           sum=l2.val+carry;
           l2.val=sum%10;
           carry=sum/10;
           pre=l2;
           l2=l2.next;
         }
          
         
         if(carry!=0)
           pre.next=new ListNode(carry);
           
        return head;
    }
}