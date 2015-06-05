/*Given a binary tree and a sum, determine if the tree has a root-to-leaf path 
such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

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
//思路：访问过程类似二叉树的后序访问
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        LinkedList<TreeNode> stack=new LinkedList<TreeNode>();
       // stack.push(root);
        int total=0;
        TreeNode node=root;
        TreeNode visited=null;
        while(!stack.isEmpty()|| node!=null)
        {
          while(node!=null)
          {
             total+=node.val;
             stack.push(node);
                      
             if(total==sum&&node.right==null&&node.left==null) 
             return true;

             node=node.left;
          }
          node=stack.peek();
          if(node.right==null || visited==node.right)
            {
              total-=node.val;
              visited=node;
              node=null;
              stack.pop();
            }
          else
            node=node.right;    
        }
        return false;
    }
}