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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        Stack<Integer>  deepth=new Stack<Integer>();
        
        if(root!=null) 
            { 
              stack.push(root);
              deepth.push(1);
            }
         int globaldeepth=0;
        while(!stack.empty())
         {
            TreeNode node=stack.pop(); 
             int deep=deepth.pop();
            if(globaldeepth<deep) 
            {
                list.add(node.val);
                globaldeepth=deep;
            }
         	if(node.left!=null)
         	   { stack.push(node.left);
         	     deepth.push(deep+1);
         	   }
         	if(node.right!=null)
         	  {  
         	      stack.push(node.right);
         	    deepth.push(deep+1);
         	  }
      }
         
         return list;
    }
}