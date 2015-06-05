/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //第一种方法 将后序转换为类似前序的过程，即先访问node,然后node.right,node.left,最后将结果翻转过来
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       Stack<TreeNode> node=new Stack<TreeNode>();
       //Stack<Integer>  value=new Stack<Integer>();
       ArrayList<Integer> list=new ArrayList<Integer>();
       if(root!=null)    
         node.push(root);
       while(!node.empty())
       {
            TreeNode treenode= node.pop();
           // value.push(treenode.val);
              list.add(treenode.val);
          
           if(treenode.left!=null)
                 node.push(treenode.left);
           
           if(treenode.right!=null)
             node.push(treenode.right);

       }
      /* while(!value.empty())     
         list.add(value.pop());
      */   
       Collections.reverse(list);
       return list;     
    }
}
