/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       Stack<TreeNode> node=new Stack<TreeNode>();
       Stack<Integer>  value=new Stack<Integer>();
       ArrayList<Integer> list=new ArrayList<Integer>();
       if(root!=null)    
         node.push(root);
       while(!node.empty())
       {
            TreeNode treenode= node.pop();
            value.push(treenode.val);
          
           if(treenode.left!=null)
                 node.push(treenode.left);
           
           if(treenode.right!=null)
             node.push(treenode.right);

       }
       while(!value.empty())     
         list.add(value.pop());
       return list;     
    }
}