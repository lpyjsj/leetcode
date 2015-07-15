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
    public int kthSmallest(TreeNode root, int k) {
        int result=0;
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();
        int step=0;
        TreeNode node=root;
        //stack.push(root);
        while(!stack.isEmpty()||root!=null)
        {
            while(node!=null)
            {
               stack.push(node);
               node=node.left;
            }
            node=stack.pop();
            step++;
            if(step==k)
            { 
             result=node.val;
             break;
            }
            node=node.right;
            
        }
       return result; 
    }
}
