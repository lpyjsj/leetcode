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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
       
        if(root==null)
          return list;
        TreeNode node=root;
   
        while(node!=null ||!stack.empty())
        {
           while(node!=null)
            {
                stack.push(node);
                node=node.left;
            }
           node=stack.pop();
           list.add(node.val);
           node=node.right;
           
        }
        
        return list;
        
    }
}