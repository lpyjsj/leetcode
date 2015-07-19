/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        ListNode tail=head;
        while(tail.next!=null)
        tail=tail.next;
        return constructBST(head,tail);
    }
    
    public TreeNode constructBST(ListNode head,ListNode tail)
    {
       //if(head==null || tail==null)
       //return null;
       if(head==tail) 
         return new TreeNode(tail.val);
       ListNode slow=head,fast=head,pre=null; 
       while(fast!=tail)
       {
           pre=slow;
           slow=slow.next;
           fast=fast.next;
           if(fast!=tail)
            fast=fast.next;
       }
       
       TreeNode root=new TreeNode(slow.val);
       root.left=constructBST(head,pre);
       if(slow!=fast)
       root.right=constructBST(slow.next,tail);
       return root;

    }
}