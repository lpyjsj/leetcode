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
    public int maxDepth(TreeNode root) {
         LinkedList<TreeNode> node=new LinkedList<TreeNode>();
         TreeNode visited=new TreeNode(-1);
         TreeNode treenode=root;
         int depth=0,maxdepth=0;
       while(!node.isEmpty() || treenode!=null)
       {
           while(treenode!=null)
            {
                node.push(treenode);
                treenode=treenode.left;
                depth++;
            }
          treenode=node.peek();
          if(treenode.right==null || visited==treenode.right)
           {
             visited=treenode;
             treenode=null;
             node.pop();
             if(maxdepth<depth)
                maxdepth=depth;
             depth--;    
           } 
          else
            treenode=treenode.right;
       }
       
       return maxdepth;
        
    }
}
